package com.miPortFoliio.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class MenuNav {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre;
    private String apellido;
    private String ubicacion;
    private String descripcion;
    private String ruta_image;
       
    public MenuNav () {
    }

    public MenuNav (String nombre, String apellido, String ubicacion, String descripcion, String ruta_image) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.ruta_image = ruta_image;
    }

    @Override
    public String toString() {
        return "MenuNav{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ",  ubicacion=" + ubicacion + ", descripcion=" + descripcion + ", ruta_image=" + ruta_image +'}';
    }
    
    
}
