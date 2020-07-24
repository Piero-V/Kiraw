package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pe.com.integrador.kiraw.R;

public class MensajesActivity extends AppCompatActivity {
    private TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_producto);



        nombre=findViewById(R.id.nombre_text);

        nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensajesActivity.this, DetalleActivity.class);
                startActivity(intent);

            }
        });
    }
}
