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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String area;
    private String empresa;
    private String tiempo;   
    private String lugarTrabajo;
    
     public Experiencia () {
    }

    public Experiencia (String school, String title, int score, String img) {
        this.area = area;
        this.empresa = empresa;
        this.tiempo = tiempo;
        this.lugarTrabajo = lugarTrabajo;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", area=" + area + ", empresa=" + empresa + ", tiempo=" + tiempo + ", lugarTrabajo=" + lugarTrabajo + '}';
    }
}
