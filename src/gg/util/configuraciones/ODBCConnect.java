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
public class ODBCConnect extends Connect{
    
    /**
     *
     * @param datosBD datos de conexion
     */
    public ODBCConnect(DatosBD datosBD) {
        super(datosBD, "jdbc:odbc", "sun.jdbc.odbc.JdbcOdbcDriver", "jdbc:odbc:%s%s%s%s");
    }

    /**
     * 
     * @param datosBD datos de conexion
     * @param formato nuevo formato de conexion
     */
    public ODBCConnect(DatosBD datosBD, String formato) {
        super(datosBD, "jdbc:odbc", "sun.jdbc.odbc.JdbcOdbcDriver", formato);
    }
    
    
}
