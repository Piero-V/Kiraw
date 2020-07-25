package pe.com.integrador.kiraw.models;

public class Productos {

    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private String description;
    private String image;
    private String dateCreated;

    /**
     * No args constructor for use in serialization
     *
     */
    public Productos() {
    }

    /**
     *
     * @param image
     * @param dateCreated
     * @param price
     * @param name
     * @param description
     * @param id
     * @param stock
     */
    public Productos(Integer id, String name, Double price, Integer stock, String description, String image, String dateCreated) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.image = image;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", dateCreated='" + dateCreated + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
