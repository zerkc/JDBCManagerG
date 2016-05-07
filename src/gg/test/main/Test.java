/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.test.main;

import gg.conex.Drivers;
import gg.opciones.DatosBD;
import gg.util.anotaciones.Columna;
import gg.util.listas.TipoConexion;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author clases
 */
public class Test {

    public static void main(String[] args) {

//        getTable(Usuario.class);
        connect();
    }

    
    //codigo Prueba
//    public static Class getTable(Class clases) {
//        //System.out.println(clases.getName());
//        Annotation[] list = clases.getAnnotations();
//        for (Annotation list1 : list) {
//            //System.out.println(list1.annotationType().getSimpleName());
//            if (list1.annotationType().getSimpleName().equals("Table")) {
//                for (Field listf : clases.getDeclaredFields()) {
//                    getColumn(listf);
//                }
//
//            }
//        }
//        return null;
//    }

    public static void connect() {

        Drivers d = new Drivers(TipoConexion.SQLSERVER, new DatosBD("192.168.123.232", "mproductosboibank", "boibankusr", "Mega2015","49627"));
        Connection con = d.getCon();
        int x = 1;
        if (con != null) {
            boolean a = true;
            System.out.println("conexion exitosa");
//            while (a) {
//                try {
//                    Statement pr = con.createStatement();
//                    pr.execute("INSERT INTO al VALUES (" + x + ",'Gustavo')");
////                pr.executeQuery();
//                    System.out.println("Termino");
//                    a = false;
//                } catch (SQLException ex) {
//                    x++;
////                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }

        }
    }

    //codigo prueba 
//    public static List<?> getColumn(Field f) {
//        Annotation[] list = f.getAnnotations();
//        //System.out.println(list.length);
//        if (list.length != 0) {
//            for (Annotation list1 : list) {
//                //      System.out.println(list1.annotationType().getSimpleName());
//                if (list1.annotationType().getSimpleName().equals("Columna")) {
//                    Columna c = f.getAnnotation(Columna.class);
//                    if (!c.name().equals("")) {
//                        System.out.println(c.name() + " tipo:" + f.getType().getSimpleName());
//                    } else {
//                        System.out.println(f.getName() + " tipo:" + f.getType().getSimpleName());
//                    }
//
//                }
//                if (list1.annotationType().getSimpleName().equals("ManyToOne")) {
//                    System.out.println(f.getName() + ": {");
//                    getTable(f.getType());
//                    System.out.println("}");
//                }
//            }
//        } else {
//            System.out.println(f.getName() + " tipo:" + f.getType().getSimpleName());
//        }
//        return null;
//    }

}
