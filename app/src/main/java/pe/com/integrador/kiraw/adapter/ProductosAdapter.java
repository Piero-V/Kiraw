package pe.com.integrador.kiraw.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import pe.com.integrador.kiraw.R;
import pe.com.integrador.kiraw.models.Productos;
import pe.com.integrador.kiraw.service.ApiService;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder> {

    private List<Productos> productos;

    public ProductosAdapter(){
        this.productos = new ArrayList<>();
    }

    public void setProductos(List<Productos> productos){
        this.productos = productos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView fotoImage;
        public TextView nombreText;
        public TextView descripcion;
        public TextView fechaProducto;

        public ViewHolder(View itemView) {
            super(itemView);
            descripcion=itemView.findViewById(R.id.descripcion_producto);
            fotoImage = itemView.findViewById(R.id.image_producto);
            nombreText = itemView.findViewById(R.id.nombre_producto);
            fechaProducto = itemView.findViewById(R.id.fecha_producto);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Productos producto = this.productos.get(position);

        viewHolder.nombreText.setText(producto.getName());
        viewHolder.descripcion.setText(producto.getDescription());
        viewHolder.fechaProducto.setText(producto.getDateCreated());


        String url = ApiService.API_BASE_URL + "/api/products/img" + producto.getImage();
        Picasso.with(viewHolder.itemView.getContext()).load(url).into(viewHolder.fotoImage);

    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }

}
