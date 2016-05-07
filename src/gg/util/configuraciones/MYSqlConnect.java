/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.configuraciones;

import gg.opciones.DatosBD;
import gg.util.interfaces.Connect;
import gg.util.listas.TipoVariableSQL;

/**
 *
 * @author clases
 */
public class MYSqlConnect extends Connect{

    public MYSqlConnect(DatosBD datosBD) {
        super(datosBD, "jdbc:mysql","com.mysql.jdbc.Driver","%s://%s:%s/%s");
    }

    @Override
    public String getTipo(TipoVariableSQL tipoVariableSQL) {
        String tipo = null;
        switch (tipoVariableSQL) {
            case STRING:
                tipo = "Varchar(255)";
                break;
            case DATE:
                tipo = "Date";
                break;
            case INT:
                tipo = "Int";
                break;
        }
        
        return tipo;
    }

}
