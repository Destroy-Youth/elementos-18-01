/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author T-107
 */
@Entity  //Clase entidad-relacional
public class Mensajito {
    
    @Id //anotacion de id de entidad
    @GeneratedValue
    private Integer id;
    private String titulo;
    private String cuerpo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }
    
    //constructores para funciones MySQL

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensajito() {
    }

    public Mensajito(Integer id) {
        this.id = id;
    }

    public Mensajito(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    
    public Mensajito(Integer id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    
    
    
}
