
package com.miPortFoliio.SpringBoot.Controller;

import com.miPortFoliio.SpringBoot.model.Usuario;
import com.miPortFoliio.SpringBoot.model.dto.UserDto;
import com.miPortFoliio.SpringBoot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class AuthController {
    
    @Autowired
    AuthService service;
    
    @PostMapping("/iniciar-sesion")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
    
}
