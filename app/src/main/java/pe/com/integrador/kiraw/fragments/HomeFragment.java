package pe.com.integrador.kiraw.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.adapter.ProductosAdapter;
import pe.com.integrador.kiraw.adapter.PublicacionesAdapter;
import pe.com.integrador.kiraw.models.Publicaciones;
import pe.com.integrador.kiraw.service.ApiService;
import pe.com.integrador.kiraw.service.ApiServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String TAG = HomeFragment.class.getSimpleName();

    private RecyclerView publicacionList;
    public  HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        publicacionList = (RecyclerView)view.findViewById(R.id.publicaciones_list);
        //  productosList.setLayoutManager(LinearLayoutManager(new MensajesFragment   ));
        publicacionList.setAdapter(new PublicacionesAdapter());

        initialize();


        return view;
    }


    private void initialize() {

        ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Publicaciones>> call = service.getPublicaciones();

        call.enqueue(new Callback<List<Publicaciones>>() {
            @Override
            public void onResponse(Call<List<Publicaciones>> call, Response<List<Publicaciones>> response) {
                try {

                    int statusCode = response.code();
                    Log.d(TAG, "HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        List<Publicaciones> publicaciones = response.body();
                        Log.d(TAG, "publicaciones: " + publicaciones);

                        PublicacionesAdapter adapter = (PublicacionesAdapter) publicacionList.getAdapter();
                        adapter.setPublicacion(publicaciones);
                        adapter.notifyDataSetChanged();

                    } else {
                        Log.e(TAG, "onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        Log.e(TAG, "onThrowable: " + t.toString(), t);
                        Toast.makeText(HomeFragment.this t.getMessage(), Toast.LENGTH_LONG).show();
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<List<Publicaciones>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
                Toast.makeText(HomeFragment.this t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }

}

