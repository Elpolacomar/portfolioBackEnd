
package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> obtenerEducacion();
    public Educacion crearEducacion(Educacion educacion);
    public void borrarEducacion(Long id);
    public Educacion obtenerEducacion(Long id);
    public void modificarEducacion(Educacion educacion);
}
