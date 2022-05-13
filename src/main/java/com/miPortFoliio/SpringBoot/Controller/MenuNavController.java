
package com.miPortFoliio.SpringBoot.Controller;

import com.miPortFoliio.SpringBoot.model.MenuNav;
import com.miPortFoliio.SpringBoot.service.MenuNavService;
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
public class MenuNavController {
    @Autowired
    public MenuNavService service;
    
    @GetMapping("/menu")
    @ResponseBody
    public List<MenuNav> obtenerMenuNav() {
        return service.obtenerMenuNav();
    }
    
    @PostMapping("/menu/create")
    @ResponseBody
    public MenuNav crearMenuNav(@RequestBody MenuNav menu) {
        return service.crearMenuNav(menu);
    }
    
    @DeleteMapping("/menu/{id}")
    public void borrarMenuNav(@PathVariable Long id) {
        service.borrarMenuNav(id);
    }
    
    @GetMapping("/menu/{id}")
    @ResponseBody
    public MenuNav obtenerMenuNav(@PathVariable Long id) {
        return service.obtenerMenuNav(id);
    }
    
    @PutMapping("/menu/update")
    public void modificarMenuNav(@RequestBody MenuNav menu) {
        System.out.println(menu);
        service.modificarMenuNav(menu);
    }
    
    
}
