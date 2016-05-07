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
 * @author clases
 */
public abstract class Connect {

    protected DatosBD datosBD;
    protected String url;
    private  String urlIni;
    private String driver;
    private Connection connection = null;
    private String formato;

    public Connect(DatosBD datosBD, String urlIni,String driver,String formato) {
        this.datosBD = datosBD;
        this.urlIni = urlIni;
        this.driver = driver;
        this.formato = formato;
    }

    public Connection getCon(){
        try{
             Class.forName(driver);
             url = String.format(formato, urlIni,datosBD.getHost(),datosBD.getPuerto(),datosBD.getBd());
             System.out.println(url);
             connection = DriverManager.getConnection(url,datosBD.getUser(),datosBD.getPass());
        }catch(Throwable e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            connection = null;
        }
        return connection;
    }
    
}
