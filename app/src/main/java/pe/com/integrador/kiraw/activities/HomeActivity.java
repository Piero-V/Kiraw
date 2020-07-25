    package pe.com.integrador.kiraw.activities;
    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.graphics.PorterDuff;
    import android.graphics.drawable.Drawable;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.Menu;
    import android.view.MenuInflater;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.FrameLayout;

    import pe.com.integrador.kiraw.R;
    import pe.com.integrador.kiraw.fragments.CarritoFragment;
    import pe.com.integrador.kiraw.fragments.HomeFragment;
    import pe.com.integrador.kiraw.fragments.MensajesFragment;
    import pe.com.integrador.kiraw.fragments.PerfilFragment;

    import androidx.appcompat.widget.Toolbar;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentTransaction;

    import com.google.android.material.bottomnavigation.BottomNavigationView;
    import com.google.firebase.auth.FirebaseAuth;

    public class HomeActivity extends AppCompatActivity {
        private Toolbar toolbar;
        private BottomNavigationView bottomNavigationView;
        private FrameLayout frameLayout;
        private PerfilFragment perfilFragment;
        private HomeFragment homeFragment;
        private CarritoFragment   carritoFragment;
        private MensajesFragment mensajesFragment;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            perfilFragment = new PerfilFragment();
            homeFragment = new HomeFragment();
            carritoFragment = new CarritoFragment();
            mensajesFragment = new MensajesFragment();
            bottomNavigationView = findViewById(R.id.bottomNavigationView);
            frameLayout = findViewById(R.id.frameLayout);

            setUpToolBar();
            setFrament(homeFragment);

            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.carrito   :
                            setFrament(carritoFragment);
                            return true;
                        case R.id.mesanjes   :
                            setFrament(mensajesFragment);
                            return true;
                        case R.id.home   :
                            setFrament(homeFragment);
                            return true;
                        case R.id.perfil   :
                            setFrament(perfilFragment);
                            return true;
                    }
                    return false;
                }
            });


            setUpHomeIconAndColor(R.drawable.ic_chat_bubble_black_24dp,R.color.white);
        }

        private void setFrament(Fragment fragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout,fragment);
            fragmentTransaction.commit();
        }


        private void setUpToolBar(){
            toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            showHomeUpItem();
        }
        private void showHomeUpItem(){
            if(getSupportActionBar() != null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);// para mostrar el icono a la izquierda del nombre
            }
        }

        private void setUpHomeIconAndColor(int drawable, int color){
            if(getSupportActionBar()!=null){
                final Drawable icon = getResources().getDrawable(drawable);
                icon.setColorFilter(getResources().getColor(color),PorterDuff.Mode.SRC_ATOP);
                getSupportActionBar().setHomeAsUpIndicator(icon);
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater= getMenuInflater();
            inflater.inflate(R.menu.menu_home, menu);
            menuIconColor(menu, R.color.black);
            return super.onCreateOptionsMenu(menu);
        }

        public void menuIconColor(Menu menu, int color){
            for(int i=0; i<menu.size(); i++ ){
                Drawable drawable = menu.getItem(i).getIcon();
                if(drawable != null){
                    drawable.mutate();
                    drawable.setColorFilter(getResources().getColor(color),PorterDuff.Mode.SRC_ATOP);
                }
            }
        }



//        @Override
//        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//            int id = item.getItemId();
//            if (id == R.id.notificacion) {
//                Intent intent = new Intent(HomeActivity.this, Notificaciones.class);
//                startActivity(intent);
//                return true;
//            } else if (id == R.id.buscar_icon) {
//                Intent intent = new Intent(HomeActivity.this, Buscar.class);
//                startActivity(intent);
//                return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }
        @Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.salir_icon:
            callLogout(null);
            return true;
    }
    return super.onOptionsItemSelected(item);
}

        private void callLogout(View view){
            FirebaseAuth.getInstance().signOut();
            finish();
        }





    }
