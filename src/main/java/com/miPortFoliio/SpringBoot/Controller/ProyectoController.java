
package com.miPortFoliio.SpringBoot.Controller;

import com.miPortFoliio.SpringBoot.model.Proyecto;
import com.miPortFoliio.SpringBoot.service.ProyectoService;
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
public class ProyectoController {
     @Autowired
    public ProyectoService service;
    
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> obtenerProyecto() {
        return service.obtenerProyecto();
    }
    
    @PostMapping("/proyecto/create")
    @ResponseBody
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return service.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        service.borrarProyecto(id);
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto obtenerProyecto(@PathVariable Long id) {
        return service.obtenerProyecto(id);
    }
    
    @PutMapping("/proyecto/update")
    public void modificarProyecto(@RequestBody Proyecto proyecto) {
        System.out.println(proyecto);
        service.modificarProyecto(proyecto);
    }
}
