package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.Habilidad;
import com.miPortFoliio.SpringBoot.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    public HabilidadRepository repository;
    
    @Override
    public List<Habilidad> obtenerHabilidad() {
         return repository.findAll();
    }

    @Override
    public Habilidad crearHabilidad(Habilidad habilidad) {
         return repository.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
         repository.deleteById(id);
    }

    @Override
    public Habilidad obtenerHabilidad(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarHabilidad(Habilidad habilidad) {
        repository.save(habilidad);
    }
    
}
