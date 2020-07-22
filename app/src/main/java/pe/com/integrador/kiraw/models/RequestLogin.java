
package pe.com.integrador.kiraw.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestLogin {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("access_token")
    @Expose
    private String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_tokenToken(String access_token) {
        this.access_token = access_token;
    }

    /**
     * No args constructor for use in serialization
     *
     */


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RequestLogin{" +
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", access_token='" +access_token + '\'' +
            '}';
    }
}
