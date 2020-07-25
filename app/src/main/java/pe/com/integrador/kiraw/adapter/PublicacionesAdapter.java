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
import pe.com.integrador.kiraw.models.Publicaciones;
import pe.com.integrador.kiraw.service.ApiService;

public class PublicacionesAdapter extends RecyclerView.Adapter<PublicacionesAdapter.ViewHolder> {

    private List<Publicaciones> publicacion;

    public PublicacionesAdapter(){
        this.publicacion = new ArrayList<>();
    }

    public void setPublicacion(List<Publicaciones> publicacion){
        this.publicacion = publicacion;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView foto_image;
        public TextView nombre_text;
        public TextView fecha_publicacion;
        public TextView descripcion;
        public ImageView foto_image_publicacion;

        public ViewHolder(View itemView) {
            super(itemView);
            foto_image = itemView.findViewById(R.id.foto_image);
            nombre_text = itemView.findViewById(R.id.nombre_text);
            fecha_publicacion = itemView.findViewById(R.id.fecha_publicacion);
            descripcion = itemView.findViewById(R.id.descripcion);
            foto_image_publicacion = itemView.findViewById(R.id.foto_image_publicacion);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Publicaciones publicaciones = this.publicacion.get(position);

        viewHolder.nombre_text.setText(publicaciones.getTitle_publication());
        viewHolder.fecha_publicacion.setText((CharSequence) publicaciones.getCreation_date());
        viewHolder.descripcion.setText(publicaciones.getTitle_description());

        String url = ApiService.API_BASE_URL + "/api/publicaciones/uploads/img/" + publicaciones.getImage_publication();
        Picasso.with(viewHolder.itemView.getContext()).load(url).into(viewHolder.foto_image_publicacion);

    }

    @Override
    public int getItemCount() {
        return this.publicacion.size();
    }

}
