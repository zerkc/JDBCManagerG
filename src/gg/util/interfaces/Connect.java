/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.interfaces;

import gg.opciones.DatosBD;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavog
 */
public abstract class Connect {

    protected DatosBD datosBD;
    protected String url;
    private final String urlIni;
    private final String driver;
    private final String formato;
    private Connection connection = null;

    public Connect(DatosBD datosBD, String urlIni, String driver, String formato) {
        this.datosBD = datosBD;
        this.urlIni = urlIni;
        this.driver = driver;
        this.formato = formato;
    }

    /**
     * 
     * @return retorna la nueva conexion a base de datos en caso de error retorna null
     */
    public Connection getCon() {
        try {
            //llama dal driver de conexion
            Class.forName(driver);
            //comoda la url de conexion para los distintos gestores de base de datos
            url = String.format(formato, urlIni, datosBD.getHost(), datosBD.getPuerto(), datosBD.getBd());
            // abre la conexion
            connection = DriverManager.getConnection(url, datosBD.getUser(), datosBD.getPass());
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            connection = null;
        }
        return connection;
    }

}
