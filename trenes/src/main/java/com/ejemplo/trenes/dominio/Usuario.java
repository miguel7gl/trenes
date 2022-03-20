package com.ejemplo.trenes.dominio;

public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private Integer edad;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setId() {
        this.id = id;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setEdad() {
        this.edad = edad;
    }

}
