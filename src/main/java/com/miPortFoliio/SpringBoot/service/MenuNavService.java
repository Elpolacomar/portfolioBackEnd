package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.MenuNav;
import com.miPortFoliio.SpringBoot.repository.MenuNavRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuNavService implements IMenuNavService{
    @Autowired
    public MenuNavRepository repository;
    
    @Override
    public List<MenuNav> obtenerMenuNav() {
         return repository.findAll();
    }

    @Override
    public MenuNav crearMenuNav(MenuNav menu) {
         return repository.save(menu);
    }

    @Override
    public void borrarMenuNav(Long id) {
         repository.deleteById(id);
    }

    @Override
    public MenuNav obtenerMenuNav(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarMenuNav(MenuNav menu) {
        repository.save(menu);
    }
    
}
