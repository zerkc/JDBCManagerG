/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.conex;

import gg.opciones.DatosBD;
import gg.util.configuraciones.MYSqlConnect;
import gg.util.configuraciones.PostgresConnect;
import gg.util.configuraciones.SQLServerConnect;
import gg.util.interfaces.Connect;
import gg.util.listas.TipoConexion;
import java.sql.Connection;
/**
 *
 * @author clases
 */
public class Drivers {
    
    Connect connect;
    Connection con;
   
    public Drivers(TipoConexion tipoConexion,DatosBD datosBD) {
        if(datosBD == null || !datosBD.valido()){
            throw new NullPointerException();
        }
        switch (tipoConexion) {
            case MYSQL:
                connect = new MYSqlConnect(datosBD);
                break;
            case POSTGRES:
                connect = new PostgresConnect(datosBD);
                break;
            case SQLSERVER:
                connect = new SQLServerConnect(datosBD);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
   public Connection getCon(){
       return connect.getCon();
   }
   
   public void ejecutarSQL(){
       
   }
   
}
