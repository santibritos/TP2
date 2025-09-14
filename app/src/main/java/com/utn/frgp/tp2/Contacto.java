package com.utn.frgp.tp2;

import java.sql.Date;

public class Contacto {
    private String nombre;
    private String apellido;
    private String email;
    private String nivelEstudios;
    private boolean aceptaTerminos;
    private boolean notificacionesActivas;
    private String telefono;
    private String direccion;
    private Date fechaNac;

    public Contacto(String nombre, String apellido, String email, String nivelEstudios, boolean aceptaTerminos, boolean notificacionesActivas, String telefono, String direccion, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nivelEstudios = nivelEstudios;
        this.aceptaTerminos = aceptaTerminos;
        this.notificacionesActivas = notificacionesActivas;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }
    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }
    public boolean isAceptaTerminos() {
        return aceptaTerminos;
    }
    public void setAceptaTerminos(boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }
    public boolean isNotificacionesActivas() {
        return notificacionesActivas;
    }
    public void setNotificacionesActivas(boolean notificacionesActivas) {
        this.notificacionesActivas = notificacionesActivas;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", nivelEstudios='" + nivelEstudios + '\'' +
                ", aceptaTerminos=" + aceptaTerminos +
                ", notificacionesActivas=" + notificacionesActivas +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }


}
