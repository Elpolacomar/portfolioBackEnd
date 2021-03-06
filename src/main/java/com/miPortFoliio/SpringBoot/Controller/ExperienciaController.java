
package com.miPortFoliio.SpringBoot.Controller;

import com.miPortFoliio.SpringBoot.model.Experiencia;
import com.miPortFoliio.SpringBoot.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class ExperienciaController {
    
    @Autowired
    public ExperienciaService service;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> obtenerEducacion() {
        return service.obtenerExperiencia();
    }
    
    @PostMapping("/experiencia/create")
    @ResponseBody
    public Experiencia crearEducacion(@RequestBody Experiencia experiencia) {
        return service.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        service.borrarExperiencia(id);
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia obtenerExperiencia(@PathVariable Long id) {
        return service.obtenerExperiencia(id);
    }
    
    @PutMapping("/experiencia/update")
    public void modificarExperiencia(@RequestBody Experiencia experiencia) {
        System.out.println(experiencia);
        service.modificarExperiencia(experiencia);
    }
    
}
