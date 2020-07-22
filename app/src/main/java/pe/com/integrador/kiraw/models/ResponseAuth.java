
package pe.com.integrador.kiraw.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseAuth {

    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("refresh_token")
    @Expose
    private String refreshToken;
    @SerializedName("expires_in")
    @Expose
    private Integer expiresIn;
    @SerializedName("scope")
    @Expose
    private String scope;
    @SerializedName("id_provider")
    @Expose
    private Integer idProvider;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("ocupation")
    @Expose
    private String ocupation;
    @SerializedName("img_profile")
    @Expose
    private String imgProfile;
    @SerializedName("correo_electronico")
    @Expose
    private String correoElectronico;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("name_provider")
    @Expose
    private String nameProvider;
    @SerializedName("img_background")
    @Expose
    private String imgBackground;
    @SerializedName("rol")
    @Expose
    private String rol;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("jti")
    @Expose
    private String jti;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseAuth() {
    }

    /**
     * 
     * @param address
     * @param ocupation
     * @param imgProfile
     * @param accessToken
     * @param rol
     * @param expiresIn
     * @param idProvider
     * @param surname
     * @param scope
     * @param tokenType
     * @param nameProvider
     * @param correoElectronico
     * @param imgBackground
     * @param email
     * @param jti
     * @param refreshToken
     * @param username
     */
    public ResponseAuth(String accessToken, String tokenType, String refreshToken, Integer expiresIn, String scope, Integer idProvider, String address, String ocupation, String imgProfile, String correoElectronico, String surname, String nameProvider, String imgBackground, String rol, String email, String username, String jti) {
        super();
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
        this.scope = scope;
        this.idProvider = idProvider;
        this.address = address;
        this.ocupation = ocupation;
        this.imgProfile = imgProfile;
        this.correoElectronico = correoElectronico;
        this.surname = surname;
        this.nameProvider = nameProvider;
        this.imgBackground = imgBackground;
        this.rol = rol;
        this.email = email;
        this.username = username;
        this.jti = jti;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
        this.idProvider = idProvider;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getImgBackground() {
        return imgBackground;
    }

    public void setImgBackground(String imgBackground) {
        this.imgBackground = imgBackground;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

}
