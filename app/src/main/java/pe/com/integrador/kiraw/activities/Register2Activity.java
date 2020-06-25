package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.integrador.kiraw.R;

public class Register2Activity extends AppCompatActivity {
    private EditText edtR_location;
    private EditText edtR_ocupation;
    private EditText edtR_gmail;
    private EditText edtR_pass;
    private EditText edtR_passc;

    private Button txtIngreseAqui;

    private Button btnRegistrarse;
    private Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        edtR_location = findViewById(R.id.edtR_location);
        edtR_ocupation = findViewById(R.id.edtR_ocupation);
        edtR_gmail = findViewById(R.id.edtR_gmail);
        edtR_pass = findViewById(R.id.edtR_pass);
        edtR_passc = findViewById(R.id.edtR_passc);

        txtIngreseAqui = findViewById(R.id.txtIngreseAqui);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);
        btnAtras = findViewById(R.id.btnAtras);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String location = edtR_location.getText().toString();
                String ocupation = edtR_ocupation.getText().toString();
                String gmail = edtR_gmail.getText().toString();
                String pass = edtR_pass.getText().toString();
                String passc = edtR_passc.getText().toString();

                if ((location.equals("")) || (ocupation.equals("")) || (gmail.equals("")) || (pass.equals(""))|| (passc.equals(""))) {
                    Toast.makeText(Register2Activity.this, "Falta llenar un campo", Toast.LENGTH_SHORT).show();

                }else{
                    Intent intent = new Intent(Register2Activity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Register2Activity.this, Register1Activity.class);
                    startActivity(intent);

            }
        });
        txtIngreseAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Register2Activity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}
