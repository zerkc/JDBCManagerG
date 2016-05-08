/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.listas;

/**
 *
 * @author gustavog
 */
public enum TipoConexionSQL {
    MYSQL,
    POSTGRES,
    SQLSERVER,
    ODBC;
    
    /**
     *
     * @param valor
     * @return
     */
    public static TipoConexionSQL getValor(String valor){
        TipoConexionSQL[] valores = TipoConexionSQL.values();
        for (TipoConexionSQL valore : valores) {
            if(valor.equals(valore.name())){
                return valore;
            }
        }
        return null;
    }
}
