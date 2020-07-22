
package pe.com.integrador.kiraw.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestSignUp {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("users")
    @Expose
    private Users users;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestSignUp() {
    }

    /**
     * 
     * @param address
     * @param occupation
     * @param phone
     * @param surname
     * @param name
     * @param users
     */
    public RequestSignUp(String address, String name, String occupation, String phone, String surname, Users users) {
        super();
        this.address = address;
        this.name = name;
        this.occupation = occupation;
        this.phone = phone;
        this.surname = surname;
        this.users = users;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
