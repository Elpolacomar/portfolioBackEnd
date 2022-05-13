package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidad> obtenerHabilidad();
    public Habilidad crearHabilidad(Habilidad habilidad);
    public void borrarHabilidad(Long id);
    public Habilidad obtenerHabilidad(Long id);
    public void modificarHabilidad(Habilidad habilidad);    
}
