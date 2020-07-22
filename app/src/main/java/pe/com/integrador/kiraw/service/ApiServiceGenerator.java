package pe.com.integrador.kiraw.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import pe.com.integrador.kiraw.models.ApiError;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public final class ApiServiceGenerator {
        //    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//
//    private static Retrofit.Builder builder = new Retrofit.Builder()
//            .baseUrl(ApiService.API_BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create());
//
//    private static Retrofit retrofit;
//
//    private ApiServiceGenerator() {
//    }
//
//    public static <S> S createService(Class<S> serviceClass) {
//        if(retrofit == null) {
//
//            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//            httpClient.addInterceptor(logging);
//
//            retrofit = builder.client(httpClient.build()).build();
//        }
//        return retrofit.create(serviceClass);
//    }

    private static final String TAG = ApiServiceGenerator.class.getSimpleName();
    private static Retrofit retrofit;

    private static Retrofit retrofitWithAuth;

    private ApiServiceGenerator() {
    }

    public static <S> S createService(Class<S> serviceClass) {


        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.readTimeout(60, TimeUnit.SECONDS).connectTimeout(60, TimeUnit.SECONDS);

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(logging);

        retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build()).build();

        return retrofit.create(serviceClass);
    }
    public static <S> S createService(final Context context, Class<S> serviceClass) {
        if(retrofitWithAuth == null) {

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            httpClient.readTimeout(60, TimeUnit.SECONDS).connectTimeout(60, TimeUnit.SECONDS);

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);

                // Retrofit Token: https://futurestud.io/tutorials/retrofit-token-authentication-on-android
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {

                    Request originalRequest = chain.request();

                    // Load Token from SharedPreferences (firsttime is null)
                    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
                    String token = sp.getString("token", null);
                    Log.d(TAG, "Loaded Token: " + token);

                    if(token == null){
                        return chain.proceed(originalRequest);
                    }

                    // Request customization: add request headers
                    Request modifiedRequest = originalRequest.newBuilder()
                            .header("Content-Type"," application/x-www-form-urlencoded")
                            .build();

                    return chain.proceed(modifiedRequest); // Call request with token
                }
            });

            retrofitWithAuth = new Retrofit.Builder()
                    .baseUrl(ApiService.API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()).build();
        }
        return retrofitWithAuth.create(serviceClass);
    }

    public static ApiError parseError(retrofit2.Response<?> response) {
        Converter<ResponseBody, ApiError> converter =
                retrofit.responseBodyConverter(ApiError.class, new Annotation[0]);
        try {
            return converter.convert(response.errorBody());
        } catch (IOException e) {
            return new ApiError("Error desconocido");
        }
    }

}
