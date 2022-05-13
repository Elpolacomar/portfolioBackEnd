
package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {    
    public List<Experiencia> obtenerExperiencia();
    public Experiencia crearExperiencia(Experiencia experiencia);
    public void borrarExperiencia(Long id);
    public Experiencia obtenerExperiencia(Long id);
    public void modificarExperiencia(Experiencia experiencia);    
}
