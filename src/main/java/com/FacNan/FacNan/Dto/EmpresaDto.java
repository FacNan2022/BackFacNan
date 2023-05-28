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
public class EmpresaDto {
     @NotBlank
    private String nombre;
      @NotBlank
    private String sobre_nosotros;
    @NotBlank
    private String imagen;

    public EmpresaDto(String nombre, String sobre_nosotros, String imagen) {
        this.nombre = nombre;
        this.sobre_nosotros = sobre_nosotros;
        this.imagen = imagen;
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
