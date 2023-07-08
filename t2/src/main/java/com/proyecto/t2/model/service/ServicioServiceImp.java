package com.proyecto.t2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.t2.model.dao.IServicioDAO;
import com.proyecto.t2.model.entidad.Servicio;

@Service
public class ServicioServiceImp implements IServicioService{

    @Autowired
    private IServicioDAO servicioDAO;

    @Override
    public void guardarServicio(Servicio servicio) {
       servicioDAO.save(servicio);
    }

    @Override
    public List<Servicio> listarServicios() {
        return servicioDAO.findAllByOrderByNombreAsc();
    }

    @Override
    public String eliminarServicio(Long id) {
        String rpta = "";
        try{
            servicioDAO.deleteById(id);
            rpta = "Se elimino el servicio correctamente";
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }
    
}
