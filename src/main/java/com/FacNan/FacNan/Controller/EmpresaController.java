/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Controller;

import com.FacNan.FacNan.Dto.EmpresaDto;
import com.FacNan.FacNan.Entity.Empresa;
import com.FacNan.FacNan.Entity.Mensaje;
import com.FacNan.FacNan.Service.EmpresaService;
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
@RequestMapping("empresa/")
@CrossOrigin(origins ="http://localhost:4200")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    
    
    @GetMapping("home")
    public ResponseEntity<List<Empresa>>empresa(){
        List<Empresa> panificado = empresaService.empresa();
        return new ResponseEntity<>(panificado,HttpStatus.OK);
        
    }
    
    
    @GetMapping("detalles/{id}")
    public ResponseEntity<Empresa> detalles(@PathVariable("id") int id){
        Empresa panificado = empresaService.getOne(id);
        return new ResponseEntity<>(panificado, HttpStatus.OK);
    }
    
  @PostMapping("create")
  public ResponseEntity<?> crear(@RequestBody EmpresaDto empresaDto){
      Empresa panificado = new Empresa(empresaDto.getNombre(), 
              empresaDto.getSobre_nosotros(), 
              empresaDto.getImagen());
      empresaService.create(panificado);
      
      return new ResponseEntity<>(new Mensaje("La empresa se creo con exito"), HttpStatus.OK);
  }
  
  @DeleteMapping("delete/{id}")
  public ResponseEntity<?>eliminar(@PathVariable("id") int id){
      empresaService.eliminarEmpresa(id);
      return new ResponseEntity<>(new Mensaje("La empresa se elimino con exito"), HttpStatus.OK);
  }
  
  @PutMapping("update/{id}")
  
  public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody EmpresaDto empresaDto){
      Empresa panificado = empresaService.getOne(id);
      
      panificado.setNombre(empresaDto.getNombre());
      panificado.setImagen(empresaDto.getImagen());
      panificado.setSobre_nosotros(empresaDto.getSobre_nosotros());
      
      empresaService.create(panificado);
      
      return new ResponseEntity<>(new Mensaje("La empresa se actualizo correctamente"), HttpStatus.OK);
  }
}
