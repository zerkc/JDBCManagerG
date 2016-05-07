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
 * @author GustavoG
 */
public class SQLServerConnect extends Connect{

    public SQLServerConnect(DatosBD datosBD) {
        //jdbc:sqlserver://VM-QA-MARCHIVO\:1433;databaseName=dbmArchivo
        super(datosBD, "jdbc:sqlserver", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "%s://%s\\:%s;databaseName=%s");
    }
    
}
