package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pe.com.integrador.kiraw.R;

public class PrincipalActivity extends AppCompatActivity {
    private Button btnRegistrate;
    private Button btnIniciarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnRegistrate = findViewById(R.id.btnRegistrarte);
        btnIniciarSesion = findViewById(R.id.btnIniciar);


        btnRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(PrincipalActivity.this, Register1Activity.class);
                startActivity(intent);
                }


        });
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });
    }
}
