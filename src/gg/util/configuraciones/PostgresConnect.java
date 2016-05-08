/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.configuraciones;

import gg.opciones.DatosBD;
import gg.util.interfaces.Connect;

/**
 *
 * @author gustavog
 */
public class PostgresConnect extends Connect {

    /**
     * 
     * @param datosBD datos de conexion
     */
    public PostgresConnect(DatosBD datosBD) {
        super(datosBD, "jdbc:postgresql", "org.postgresql.Driver", "%s://%s:%s/%s");
    }
    
}
