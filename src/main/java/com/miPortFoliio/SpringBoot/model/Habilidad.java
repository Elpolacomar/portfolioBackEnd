
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
public class Habilidad {
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String tipo;
    private Integer anio;
    private Integer porcentaje;
       
     public Habilidad () {
    }

    public Habilidad (String tipo, Integer anio, Integer porcentaje) {
        this.tipo = tipo;
        this.anio = anio; 
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "id=" + id + ", tipo=" + tipo + ", anio=" + anio + ", porcentaje=" + porcentaje + '}';
    }
    
}
