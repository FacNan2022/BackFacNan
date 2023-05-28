/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FacNan.FacNan.Service;

import com.FacNan.FacNan.Entity.Empresa;
import com.FacNan.FacNan.Interface.EmpresaInterface;
import com.FacNan.FacNan.Repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService implements EmpresaInterface {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> empresa() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa getOne(int id) {
       return empresaRepository.findById(id).get();
    }

    @Override
    public void create(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void eliminarEmpresa(int id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public boolean exitsByEmpresa(String nombre) {
        return empresaRepository.existsByNombre(nombre);
    }

    @Override
    public boolean existsById(int id) {
       return empresaRepository.existsById(id);
    }
    
}
