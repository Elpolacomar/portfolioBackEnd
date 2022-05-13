
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String school;
    private String title;
    private String career;
    private int score;
    private int start;
    private int end;
    private String description;

    public Educacion() {
    }

    public Educacion(String school, String title, String career,int score, int start, int end, String description ) {
        this.school = school;
        this.title = title;        
        this.career = career;
        this.score = score;
        this.start = start;
        this.end = end;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", school=" + school + ", title=" + title + ", career=" + career + ", score=" + score +", start=" + start +", end=" + end +", description=" + description +'}';
    }
}
