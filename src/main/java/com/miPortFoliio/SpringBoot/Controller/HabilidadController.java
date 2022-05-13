
package com.miPortFoliio.SpringBoot.Controller;

import com.miPortFoliio.SpringBoot.model.Habilidad;
import com.miPortFoliio.SpringBoot.service.HabilidadService;
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
public class HabilidadController {
     @Autowired
    public HabilidadService service;
    
    @GetMapping("/habilidad")
    @ResponseBody
    public List<Habilidad> obtenerHabilidad() {
        return service.obtenerHabilidad();
    }
    
    @PostMapping("/habilidad/create")
    @ResponseBody
    public Habilidad crearHabilidad(@RequestBody Habilidad habilidad) {
        return service.crearHabilidad(habilidad);
    }
    
    @DeleteMapping("/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id) {
        service.borrarHabilidad(id);
    }
    
    @GetMapping("/habilidad/{id}")
    @ResponseBody
    public Habilidad obtenerHabilidad(@PathVariable Long id) {
        return service.obtenerHabilidad(id);
    }
    
    @PutMapping("/habilidad/update")
    public void modificarHabilidad(@RequestBody Habilidad habilidad) {
        System.out.println(habilidad);
        service.modificarHabilidad(habilidad);
    }
    
}
