package com.miPortFoliio.SpringBoot.repository;

import com.miPortFoliio.SpringBoot.model.MenuNav;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuNavRepository extends JpaRepository<MenuNav, Long>{
    
}
