package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.integrador.kiraw.R;

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
                if (user.equals("a") && pass.equals("a")) {
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

    }


}
