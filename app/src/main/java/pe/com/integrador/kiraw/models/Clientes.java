package pe.com.integrador.kiraw.models;

public class Clientes {

    private Integer id;
    private String address;
    private String name;
    private String ocupation;
    private Integer phone;
    private String surname;
    private String img_background;
    private String img_profile;

    public Clientes(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImg_background() {
        return img_background;
    }

    public void setImg_background(String img_background) {
        this.img_background = img_background;
    }

    public String getImg_profile() {
        return img_profile;
    }

    public void setImg_profile(String img_profile) {
        this.img_profile = img_profile;
    }

    @Override
    public String toString() {
        return "clients{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", occupation='" + ocupation + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", img_background='" + img_background+ '\'' +
                ", img_profile='" + img_profile + '\'' +
                '}';
    }
}

