/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.listas;

/**
 *
 * @author clases
 */
public enum TipoConexion {
    MYSQL,
    POSTGRES,
    SQLSERVER,
    ODBC;
    
    /**
     *
     * @param valor
     * @return
     */
    public static TipoConexion getValor(String valor){
        TipoConexion[] valores = TipoConexion.values();
        for (TipoConexion valore : valores) {
            if(valor.equals(valore.name())){
                return valore;
            }
        }
        return null;
    }
}
