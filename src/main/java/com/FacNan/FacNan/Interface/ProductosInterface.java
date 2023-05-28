/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.FacNan.FacNan.Interface;

import com.FacNan.FacNan.Entity.Proyectos;
import java.util.List;

/**
 *
 * @author facundo
 */
public interface ProductosInterface {
    
    public List<Proyectos>proyectos();
    public Proyectos getOne(int id);
    public void create(Proyectos proyectos);
    public void eliminarProducto(int id);
    public boolean existsByNombre(String nombre);
    public boolean existsById(int id);
    
}
