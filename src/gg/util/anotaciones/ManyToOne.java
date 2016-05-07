/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg.util.anotaciones;

import gg.util.listas.ForeignCascade;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author GustavoG
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ManyToOne {
    public ForeignCascade[] foreing() default ForeignCascade.NOACTION;
}
