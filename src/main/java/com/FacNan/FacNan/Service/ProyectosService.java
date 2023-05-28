/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Service;

import com.FacNan.FacNan.Entity.Proyectos;
import com.FacNan.FacNan.Interface.ProductosInterface;
import com.FacNan.FacNan.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements ProductosInterface{
    @Autowired
    ProyectosRepository proyectosRepository;

    @Override
    public List<Proyectos> proyectos() {
       return proyectosRepository.findAll();
    }

    @Override
    public Proyectos getOne(int id) {
       return proyectosRepository.findById(id).get();
               
    }

    @Override
    public void create(Proyectos proyectos) {
       proyectosRepository.save(proyectos);
    }

    @Override
    public void eliminarProducto(int id) {
        proyectosRepository.deleteById(id);
    }

    @Override
    public boolean existsByNombre(String nombre) {
       return proyectosRepository.existsByNombreProyecto(nombre);
    }

    @Override
    public boolean existsById(int id) {
       return proyectosRepository.existsById(id);
    }
    
    
}
