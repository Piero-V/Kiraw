package pe.com.integrador.kiraw.service;

import java.util.List;

import pe.com.integrador.kiraw.models.Clientes;
import pe.com.integrador.kiraw.models.Productos;
import pe.com.integrador.kiraw.models.RequestLogin;
import pe.com.integrador.kiraw.models.RequestSignUp;
import pe.com.integrador.kiraw.models.ResponseAuth;
import pe.com.integrador.kiraw.models.ResponseMessage;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    String API_BASE_URL = "https://c2893bc5f01f.ngrok.io";
//    String API_BASE_URL = "http://192.168.0.107:8081";

//    @POST("/api")
//    Call<List<Clientes>> getClientes();
//    @POST("/api")
//    Call<List<Clientes>> getUsers();
//
//
//    @FormUrlEncoded
//    @POST("/cliente")
//    Call<ResponseMessage> createClientes(@Field("address") String address,
//                                         @Field("name") String name,
//                                         @Field("occupation") String occupation,
//                                         @Field("phone") String phone ,
//                                         @Field("surname") String surname,
//                                         @Field("email") String email,
//                                         @Field("password") Boolean password,
//                                         @Field("enable") String enable,
//                                         @Field("username") String username,
//                                         @Field("img_background") String img_background,
//                                         @Field("img_profile") String img_profile
//                                         );

    @POST("/oauth/token")
    Call<ResponseAuth> doLogin(@Field("username") String username,
                               @Field("password") String password);

    @POST("/api/clientes")
    Call<ResponseAuth> doSignUp(@Body RequestSignUp requestSignUp);
    @GET("/api/products")
    Call<List<Productos>> getProductos();







}

