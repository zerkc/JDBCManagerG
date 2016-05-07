/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.test.entidades;

import gg.util.anotaciones.Table;

/**
 *
 * @author clases
 */
@Table
public class Telefono {
    private int id;
    private String tel;

    public Telefono() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
