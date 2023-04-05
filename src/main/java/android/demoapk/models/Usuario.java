package android.demoapk.models;

import com.github.javafaker.Faker;

public class Usuario {

    private String nombre;

    private String direccion1;
    private String direccion2;
    private String ciudad;
    private String estado;
    private String pais;
    Faker faker=new Faker();
    public Usuario() {

        nombre = faker.name().fullName();
        direccion1 = faker.address().streetAddress();
        direccion2 = faker.address().secondaryAddress();
        ciudad = faker.address().city();
        estado = faker.address().state();
        pais = faker.address().country();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
