package com.ejemplo.trenes.dominio;

public class Consulta {
    private String email;
    private String password;
    private String address;
    private String motivo;

    public Consulta (String email, String password, String address, String motivo)
    {
        this.email = email;
        this.password = password;
        this.address = address;
        this.motivo = motivo;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setPassword() {
        this.password = password;
    }

    public void setAddress() {
        this.address = address;
    }

    public void setMotivo() {
        this.motivo = motivo;
    }

    @Override
    public String toString()
    {
        return "Email: " + getEmail() + 
               "Contraseña: " + getPassword() + 
               "Dirección: " + getAddress() +
               "Motivo: " + getMotivo();
    }

}

