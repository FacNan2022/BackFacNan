/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyectos {
    @NotNull
    @Id
    private int id;
    @NotNull
    private String nombreProyecto;
     @NotNull
    private String link;
      @NotNull
    private String img;
       @NotNull
    private String descripcion;

    public Proyectos() {
    }
       

    public Proyectos(String nombreProyecto, String link, String img, String descripcion) {
        this.nombreProyecto = nombreProyecto;
        this.link = link;
        this.img = img;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
       
       
       
    
    
    
    
}
