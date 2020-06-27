package pe.com.integrador.kiraw.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import pe.com.integrador.kiraw.R;

public class Notificaciones extends AppCompatActivity {

    private Toolbar toolbar_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
        setUpToolBar();
        setUpHomeUpIconAndColor(R.drawable.ic_atras,R.color.black);
    }

    private void setUpHomeUpIconAndColor(int drawable, int color) {
        if(getSupportActionBar()!=null){
            final Drawable icon = getResources().getDrawable(drawable);
            icon.setColorFilter(getResources().getColor(color),PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(icon);
        }
    }
    private void setUpToolBar(){
        toolbar_notification = findViewById(R.id.toolbar_notification);
        setSupportActionBar(toolbar_notification);
        showHomeUpItem();
    }
    private void showHomeUpItem(){
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            // para mostrar el icono a la izquierda del nombre
        }


    }














}