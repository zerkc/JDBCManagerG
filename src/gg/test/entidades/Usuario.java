/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.test.entidades;

import gg.util.anotaciones.Columna;
import gg.util.anotaciones.ManyToOne;
import gg.util.anotaciones.Table;

/**
 *
 * @author clases
 */
@Table
public class Usuario {

    @Columna(name ="PEPE")
    private String nombre;
    @Columna
    private String apellido;
    private int edad;
    @ManyToOne
    private Telefono tel;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Telefono getTel() {
        return tel;
    }

    public void setTel(Telefono tel) {
        this.tel = tel;
    }
    
    
}
