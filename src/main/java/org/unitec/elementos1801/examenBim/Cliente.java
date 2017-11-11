/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801.examenBim;

import javax.persistence.*;


/**
 *
 * @author Ivan
 */
@Entity
public class Cliente {
    @Id
    private Integer clientei;
    private String nombre;

    public Cliente(Integer clientei, String nombre) {
        this.clientei = clientei;
        this.nombre = nombre;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(Integer clientei) {
        this.clientei = clientei;
    }

    public Cliente() {
    }

    public Integer getClientei() {
        return clientei;
    }

    public void setClientei(Integer clientei) {
        this.clientei = clientei;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
