package pe.com.integrador.kiraw.models;

import java.sql.Date;

public class Publicaciones {
    private Integer id;
    private Date creation_date;
    private String image_publication;
    private String title_description;
    private String title_publication;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getImage_publication() {
        return image_publication;
    }

    public void setImage_publication(String image_publication) {
        this.image_publication = image_publication;
    }

    public String getTitle_description() {
        return title_description;
    }

    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    public String getTitle_publication() {
        return title_publication;
    }

    public void setTitle_publication(String tittle_publication) {
        this.title_publication = tittle_publication;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "id=" + id +
                ", creation_date='" + creation_date + '\'' +
                ", image_publication'" + image_publication + '\'' +
                ", title_description='" + title_description + '\'' +
                ", title_publication='" + title_publication + '\'' +
                '}';
    }
}
