package com.example.escenariosdeportivos.escenariosPaquete;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Escenario {

    @SerializedName("adminstracion")
    @Expose
    private String adminstracion;
    @SerializedName("comuna")
    @Expose
    private String comuna;
    @SerializedName("localizacion")
    @Expose
    private String localizacion;
    @SerializedName("matricula_inmobiliaria")
    @Expose
    private String matriculaInmobiliaria;
    @SerializedName("nombre")
    @Expose
    private String nombre;

    public String getAdminstracion() {
        return adminstracion;
    }

    public void setAdminstracion(String adminstracion) {
        this.adminstracion = adminstracion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getMatriculaInmobiliaria() {
        return matriculaInmobiliaria;
    }

    public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
        this.matriculaInmobiliaria = matriculaInmobiliaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
