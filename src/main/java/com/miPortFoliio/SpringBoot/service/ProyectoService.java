
package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.Proyecto;
import com.miPortFoliio.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository repository;
    
    @Override
    public List<Proyecto> obtenerProyecto() {
         return repository.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
         return repository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
         repository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyecto(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
        repository.save(proyecto);
    }
}
