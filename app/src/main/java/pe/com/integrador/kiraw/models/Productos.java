package pe.com.integrador.kiraw.models;


import java.util.Date;

public class Productos {
    private Integer id;
    private Date date_created;
    private String description;
    private String product_image;
    private String product_name;
    private Double price;
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", date_created='" + date_created + '\'' +
                ", description='" + description + '\'' +
                ", product_image='" + product_image + '\'' +
                ", product_name='" + product_name + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
