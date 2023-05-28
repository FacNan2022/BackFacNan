/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



/**
 *
 * @author facundo
 */@Entity
public class Empresa {
    @NotNull
    @Id
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String sobre_nosotros;
    @NotNull
    private String imagen;

    public Empresa(String nombre, String sobre_nosotros, String imagen) {
        this.nombre = nombre;
        this.sobre_nosotros = sobre_nosotros;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSobre_nosotros() {
        return sobre_nosotros;
    }

    public void setSobre_nosotros(String sobre_nosotros) {
        this.sobre_nosotros = sobre_nosotros;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
}
