/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.conex;

import gg.opciones.DatosBD;
import gg.util.configuraciones.MYSqlConnect;
import gg.util.configuraciones.ODBCConnect;
import gg.util.configuraciones.PostgresConnect;
import gg.util.configuraciones.SQLServerConnect;
import gg.util.interfaces.Connect;
import gg.util.listas.TipoConexionSQL;
import java.sql.Connection;

/**
 *
 * @author gustavog
 */
public class Drivers {

    Connect connect;
    Connection con;

    /**
     * 
     * @param tipoConexion a cual base de datos sql se hara la conexion
     * @param datosBD Datos para la conexion
     */
    public Drivers(TipoConexionSQL tipoConexion, DatosBD datosBD) {
        //verifica que los datos para la conexion no sean nulos
        if (datosBD == null || (!datosBD.valido() && tipoConexion != TipoConexionSQL.ODBC)) {
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
            case ODBC:
                //valida si hay usuario y contraseña para la conexion por ODBC
                if (!valido(datosBD.getUser()) && !valido(datosBD.getPass())) {
                    connect = new ODBCConnect(datosBD);
                } else {
                    //si Existe Usuario y/o contraseña pra la conexion por ODBC los introduce en la url de conexion
                    String formato = "jdbc:odbc:%s%s%s%s; "+getFormatValido("Uid", datosBD.getUser())+" "+getFormatValido("Pwd", datosBD.getPass());
                    connect = new ODBCConnect(datosBD,formato);
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    /**
     * 
     * @param tipoConexion a cual base de datos sql se hara la conexion
     * @param host host/ip a la cual se hara la conexion
     * @param bd nombre de la base de datos
     * @param user usuario de la base de datos
     * @param pass contraseña de la base de datos
     * @param puerto puerto de la base de datos
     */
    public Drivers(TipoConexionSQL tipoConexion, String host, String bd, String user, String pass, String puerto) {
        this(tipoConexion, new DatosBD(host, bd, user, pass, puerto));
    }

    /**
     * 
     * @return retorna una nueva conexion a la base de datos
     */
    public Connection getCon() {
        return connect.getCon();
    }

    public boolean valido(String valor) {
        return valor != null && !valor.isEmpty() && valor.trim().isEmpty();
    }
    
    public String getFormatValido(String pre,String valor){
        if(valido(valor)){
            return pre+"="+valor+";";
        }
        
        return "";
    }

}
