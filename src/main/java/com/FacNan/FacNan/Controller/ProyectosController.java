/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Controller;

import com.FacNan.FacNan.Dto.ProyectosDto;
import com.FacNan.FacNan.Entity.Mensaje;
import com.FacNan.FacNan.Entity.Proyectos;
import com.FacNan.FacNan.Service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("panificados/")
@CrossOrigin(origins ="http://localhost:4200")

public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;
    
    @GetMapping("proyectos")
    public ResponseEntity<List<Proyectos>> proyectos(){
        
        List<Proyectos> proyectos  = proyectosService.proyectos();
        
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    @GetMapping("detalles/{id}")
    public ResponseEntity<Proyectos> proyecto(@PathVariable("id")int id){
        Proyectos proyecto = proyectosService.getOne(id);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }
    
    
    @PostMapping("create")
    public ResponseEntity<?> crear(@RequestBody ProyectosDto proyectoDto){
        Proyectos proyecto = new Proyectos(proyectoDto.getNombreProyecto(),
        proyectoDto.getLink(),
        proyectoDto.getImg(),
        proyectoDto.getDescripcion());
        
        proyectosService.create(proyecto);
        
        return new ResponseEntity<>(new Mensaje("El proyecto se agrego con exito"), 
                HttpStatus.OK);
    }
    
    
    @DeleteMapping("delete/{id}")
    
    public ResponseEntity<?> eliminar(@PathVariable("id") int id){
        proyectosService.eliminarProducto(id);
        
        return new ResponseEntity<>(new Mensaje("El Proyecto se elimino con exito"),
                HttpStatus.OK);
    }
    
    
    @PutMapping("update/{id}")
    
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody ProyectosDto proyectoDto){
        Proyectos proyecto = proyectosService.getOne(id);
        
        proyecto.setNombreProyecto(proyectoDto.getNombreProyecto());
        proyecto.setLink(proyectoDto.getLink());
        proyecto.setImg(proyectoDto.getImg());
        proyecto.setDescripcion(proyectoDto.getDescripcion());
        
        proyectosService.create(proyecto);
        
        return new ResponseEntity<>(new Mensaje("El proyecto se actualizo con exito"),
        HttpStatus.OK);
    }
    
    
    
    
    
}
