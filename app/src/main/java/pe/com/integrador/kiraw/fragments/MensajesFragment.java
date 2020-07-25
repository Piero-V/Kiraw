package pe.com.integrador.kiraw.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.adapter.ProductosAdapter;
import pe.com.integrador.kiraw.models.Productos;
import pe.com.integrador.kiraw.service.ApiService;
import pe.com.integrador.kiraw.service.ApiServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MensajesFragment extends Fragment {
    private static final String TAG = MensajesFragment.class.getSimpleName();

    private RecyclerView productosList;

    public MensajesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mensajes, container, false);
        productosList = (RecyclerView)view.findViewById(R.id.publicaciones_list);
      //  productosList.setLayoutManager(LinearLayoutManager(new MensajesFragment   ));
        productosList.setAdapter(new ProductosAdapter());

        initialize();


        return view;
    }

    private void initialize() {

        ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Productos>> call = service.getProductos();

        call.enqueue(new Callback<List<Productos>>() {
            @Override
            public void onResponse(Call<List<Productos>> call, Response<List<Productos>> response) {
                try {

                    int statusCode = response.code();
                    Log.d(TAG, "HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        List<Productos> productos = response.body();
                        Log.d(TAG, "productos: " + productos);

                        ProductosAdapter adapter = (ProductosAdapter) productosList.getAdapter();
                        adapter.setProductos(productos);
                        adapter.notifyDataSetChanged();

                    } else {
                        Log.e(TAG, "onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        Log.e(TAG, "onThrowable: " + t.toString(), t);
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<List<Productos>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
            }

        });
    }

}
