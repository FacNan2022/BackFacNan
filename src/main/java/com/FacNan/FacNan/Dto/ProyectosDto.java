/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author facundo
 */
public class ProyectosDto {
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String link;
    @NotBlank
    private String img;
     @NotBlank
    private String descripcion;

    public ProyectosDto(String nombreProyecto, String link, String img, String descripcion) {
        this.nombreProyecto = nombreProyecto;
        this.link = link;
        this.img = img;
        this.descripcion = descripcion;
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
