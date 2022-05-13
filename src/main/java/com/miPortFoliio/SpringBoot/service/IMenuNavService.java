package com.miPortFoliio.SpringBoot.service;

import com.miPortFoliio.SpringBoot.model.MenuNav;
import java.util.List;

public interface IMenuNavService {
    public List<MenuNav> obtenerMenuNav();
    public MenuNav crearMenuNav(MenuNav menu);
    public void borrarMenuNav(Long id);
    public MenuNav obtenerMenuNav(Long id);
    public void modificarMenuNav(MenuNav menu);
    
}
