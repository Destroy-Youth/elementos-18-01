/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801.examenBim;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author Ivan
 * 
 * 
 * 
 * tarjetai integer primary key,
tipo varchar(20),
fechavenc date,
clientei integer,
FOREIGN KEY (clientei) REFERENCES cliente(clientei));
 */
@Entity
public class Tarjeta {
    @Id
    private Integer tarjetai;
    private String tipo;
    private Integer saldo;
    private Date fechavenc;
    @OneToOne 
    @JoinColumn(name="clientei") 
    private Cliente cl;

    public Tarjeta(Integer tarjetai, String tipo, Integer saldo, Date fechavenc, Cliente cl) {
        this.tarjetai = tarjetai;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechavenc = fechavenc;
        this.cl = cl;
    }

    public Tarjeta(String tipo, Integer saldo, Date fechavenc, Cliente cl) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechavenc = fechavenc;
        this.cl = cl;
    }

    public Tarjeta(Integer tarjetai) {
        this.tarjetai = tarjetai;
    }

    public Tarjeta() {
    }

    public Integer getTarjetai() {
        return tarjetai;
    }

    public void setTarjetai(Integer tarjetai) {
        this.tarjetai = tarjetai;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Date getFechavenc() {
        return fechavenc;
    }

    public void setFechavenc(Date fechavenc) {
        this.fechavenc = fechavenc;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    
}
