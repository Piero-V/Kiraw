package pe.com.integrador.kiraw.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.models.Clientes;

public class ClientesAdapter extends RecyclerView.Adapter<ClientesAdapter.Holderview> {
    private List<Clientes> clienteslist;
    private Context context;

    public ClientesAdapter(List<Clientes> clienteslist, Context context) {
        this.clienteslist = clienteslist;
        this.context = context;
    }

    @NonNull
    @Override
    public Holderview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buscar,parent,false);

        return new Holderview(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull Holderview holder, final int position) {
        holder.v_name.setText(clienteslist.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"click on" + clienteslist.get(position).getName(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return clienteslist.size();
    }


    public void setfilter(List<Clientes> listclientes){
        clienteslist= new ArrayList<>();
        clienteslist.addAll(listclientes);
        notifyDataSetChanged();
    }
    class Holderview extends RecyclerView.ViewHolder
    {
        TextView v_name;
        Holderview(View itemview){
            super(itemview);
            v_name=(TextView) itemview.findViewById(R.id.text_buscar);
        }
    }
}
