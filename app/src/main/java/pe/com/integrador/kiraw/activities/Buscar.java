package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.adapter.ClientesAdapter;
import pe.com.integrador.kiraw.models.Clientes;

public class Buscar extends AppCompatActivity {
//    SearchView searchView;
//    ClientesAdapter adapter;
//
//    RecyclerView recyclerView;
//
//    List<Clientes> clienteslist=new ArrayList<>();
//    private Toolbar toolbar_notification;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_buscar);
//
//        clienteslist.add(new Clientes("Piero"));
//        clienteslist.add(new Clientes("Darwin"));
//        clienteslist.add(new Clientes("Marco"));
//        clienteslist.add(new Clientes("Carlos"));
//
//        recyclerView=(RecyclerView) findViewById(R.id.buscar);
//        changeSearchTextColor(searchView);
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        adapter = new ClientesAdapter(clienteslist,this);
//        recyclerView.setAdapter(adapter);
//
//    }
//
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_home,menu);
//        final MenuItem myActionnMenuItem =menu.findItem(R.id.buscar_icon);
//        searchView=(SearchView) myActionnMenuItem.getActionView();
//        ((EditText)searchView.findViewById(androidx.appcompat.R.id.search_src_text) ).setHintTextColor(getResources().getColor(R.color.white));
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                if(!searchView.isIconified()){
//                    searchView.setIconified(true);
//                }
//                myActionnMenuItem.collapseActionView();
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                final List<Clientes> filtermodelist=filter(clienteslist,newText);
//                adapter.setfilter(filtermodelist);
//                return true;
//            }
//        });
//
//        return true;
//    }
//    private List<Clientes> filter(List<Clientes> p1,String query){
//        query=query.toLowerCase();
//        final List<Clientes> filteredModelList = new ArrayList<>();
//        for(Clientes model:p1){
//            final String text= model .getName().toLowerCase();
//            if ( text.startsWith(query)){
//                filteredModelList.add(model);
//
//            }
//        }
//        return filteredModelList;
//
//    }
//
//    private void changeSearchTextColor(View view){
//        if (view !=null ){
//            if (view instanceof TextView){
//                ((TextView) view).setTextColor(Color.WHITE);
//                return;
//            }else if (view instanceof ViewGroup){
//                ViewGroup viewGroup = (ViewGroup) view;
//                for (int i =0; i< viewGroup.getChildCount(); i++){
//                    changeSearchTextColor(viewGroup.getChildAt(i));
//                }
//
//            }
//        }
//    }
//
//

}