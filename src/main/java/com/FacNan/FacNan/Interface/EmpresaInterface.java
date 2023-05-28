/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.FacNan.FacNan.Interface;

import com.FacNan.FacNan.Entity.Empresa;
import java.util.List;


public interface EmpresaInterface {
    public List<Empresa> empresa();
    public Empresa getOne(int id);
    public void create(Empresa empresa);
    public void eliminarEmpresa(int id);
    public boolean exitsByEmpresa(String nombre);
    public boolean existsById(int id);
    
}
