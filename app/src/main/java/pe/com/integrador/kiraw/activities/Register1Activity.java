package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.models.ResponseMessage;
import pe.com.integrador.kiraw.service.ApiService;
import pe.com.integrador.kiraw.service.ApiServiceGenerator;
import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.Response;

public class Register1Activity extends AppCompatActivity {
    private static final String TAG = Register1Activity.class.getSimpleName();

    private EditText edtR_name;
    private EditText edtR_surname;
    private EditText edtR_username;
    private EditText edtR_phone,edtR_location,edtR_ocupation,edtR_gmail,edtR_pass;



    private Button btnRegistrarse,btnR_ingreseaqui;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        edtR_name = findViewById(R.id.edtR_name);
        edtR_surname = findViewById(R.id.edtR_surname);
        edtR_username = findViewById(R.id.edtR_username);
        edtR_phone = findViewById(R.id.edtR_phone);
        edtR_location = findViewById(R.id.edtR_location);
        edtR_ocupation = findViewById(R.id.edtR_ocupation);
        edtR_gmail = findViewById(R.id.edtR_gmail);
        edtR_pass = findViewById(R.id.edtR_pass);


        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        btnR_ingreseaqui = findViewById(R.id.txtIngreseAqui);

        btnR_ingreseaqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Register1Activity.this, PrincipalActivity.class);
                startActivity(intent);

            }
        });
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Register1Activity.this, HomeActivity.class);
                startActivity(intent);

            }
        });
    }
//    public void callRegister(View view){
//
//            String address =edtR_location.getText().toString();
//            String name = edtR_name.getText().toString();
//            String occupation = edtR_ocupation.getText().toString();
//            String phone = edtR_phone.getText().toString();
//            String surname = edtR_surname.getText().toString();
//            String email= edtR_gmail.getText().toString();
//            String password=edtR_pass.getText().toString();
//            String username=edtR_username.getText().toString();
//            String img_b = null;
//            String img_p  = null;
//            Boolean enable = true;
//
//            ApiService service = ApiServiceGenerator.createService(ApiService.class);
//
//            Call<ResponseMessage> call = null;
//        Call<ResponseMessage> call2 = null;
//
//            call.enqueue(new Callback<ResponseMessage>() {
//                @Override
//                public void onResponse(Call<ResponseMessage> call, Response<ResponseMessage> response) {
//                    try {
//
//                        int statusCode = response.code();
//                        Log.d(TAG, "HTTP status code: " + statusCode);
//
//                        if (response.isSuccessful()) {
//
//                            ResponseMessage responseMessage = response.body();
//                            Log.d(TAG, "responseMessage: " + responseMessage);
//
//                            Toast.makeText(Register1Activity.this, responseMessage.getMessage(), Toast.LENGTH_LONG).show();
//                            finish();
//
//                        } else {
//                            Log.e(TAG, "onError: " + response.errorBody().string());
//                            throw new Exception("Error en el servicio");
//                        }
//
//                    } catch (Throwable t) {
//                        try {
//                            Log.e(TAG, "onThrowable: " + t.toString(), t);
//                            Toast.makeText(Register1Activity.this, t.getMessage(), Toast.LENGTH_LONG).show();
//                        } catch (Throwable x) {
//                        }
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<ResponseMessage> call, Throwable t) {
//                    Log.e(TAG, "onFailure: " + t.toString());
//                    Toast.makeText(Register1Activity.this, t.getMessage(), Toast.LENGTH_LONG).show();
//                }
//
//            }
//            );
//
//
//    }

}
