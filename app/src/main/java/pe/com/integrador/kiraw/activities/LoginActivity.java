package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.models.ResponseAuth;
import pe.com.integrador.kiraw.service.ApiService;
import pe.com.integrador.kiraw.service.ApiServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPass;
    private Button btnLogin;
    private Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnCancelar = findViewById(R.id.btnCancelar);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUser.getText().toString();
                String pass = edtPass.getText().toString();
                if (user.equals("Piero.vasquez@gmail.com") && pass.equals("123")) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Login incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });


//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                login();
//            }
//        });
//
//
//        loadLastUsername();
//
//        verifyLoginStatus();


    }


//    private void login() {
//        String user = edtUser.getText().toString();
//        String password = edtPass.getText().toString();
//
//        if (user.isEmpty()) {
//            Toast.makeText(this, "Ingrese usuario", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        if (password.isEmpty()) {
//            Toast.makeText(this, "Ingrese el contraseña", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        ApiService service = ApiServiceGenerator.createService(ApiService.class);
//        Call<ResponseAuth> call = service.doLogin(user, password);
//        call.enqueue(new Callback<ResponseAuth>() {
//
//
//            @Override
//            public void onResponse(Call<ResponseAuth> call, Response<ResponseAuth> response) {
//                if (response.isSuccessful()) {
//                    ResponseAuth usuarioResponse = response.body();
//
//                    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
//                    sp.edit()
//                            .putString("dni", usuarioResponse.getUsername())
//                            .putString("token", usuarioResponse.getAccessToken())
//                            .putBoolean("islogged", true)
//                            .commit();
//                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
//                    finish();
//
//                    Toast.makeText(LoginActivity.this, "Bienvenido " + usuarioResponse.getUsername(), Toast.LENGTH_LONG).show();
//
//                } else {
//                    /*   ApiError error = ApiServiceGenerator.parseError(response);*/
//                    /* Toast.makeText(MainActivity.this, "onError:" + error.getMessage(), Toast.LENGTH_LONG).show();*/
//                    Toast.makeText(LoginActivity.this, "Error en el dni o la contraseña", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//
//            @Override
//            public void onFailure(Call<ResponseAuth> call, Throwable t) {
//                Toast.makeText(LoginActivity.this, "onFailure: " + t.toString(), Toast.LENGTH_LONG).show();
//
//            }
//
//
//        });
//
//
//    }
//
//    private void loadLastUsername() {
//        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
//
//        String username = sp.getString("dni", null);
//        if (username != null) {
//            edtUser.setText(username);
//        }
//    }
//
//    private void verifyLoginStatus() {
//
//        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
//        boolean islogged = sp.getBoolean("islogged", false);
//
//        if (islogged) {
//            startActivity(new Intent(this, HomeActivity.class));
//            finish();
//        }
//
//
//    }
}
