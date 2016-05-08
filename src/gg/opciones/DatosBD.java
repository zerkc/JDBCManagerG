/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.opciones;

/**
 *
 * @author gustavog
 */
public class DatosBD {
    private  String host;
    private  String bd;
    private  String user;
    private  String pass;
    private  String puerto;

    public DatosBD() {
    }

    public DatosBD(String host, String bd, String user, String pass,String puerto) {
        this.host = host;
        this.bd = bd;
        this.user = user;
        this.pass = pass;
        this.puerto = puerto;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
    
    public boolean valido(){
        if(!datosValido(host) || !datosValido(bd) || !datosValido(user) || !datosValido(puerto)){
            return false;
        }
        return true;
    }
    
    private boolean datosValido(String datos){
        return !(datos == null);
    }
    
}
