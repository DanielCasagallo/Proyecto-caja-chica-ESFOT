/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaChica;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class ClsCajaChica implements Serializable{

    private final int codcajachica=01;
    private final double totalcajachica=200;
    private double reposicion;
    private double cantiactual;

    public double getReposicion() {
        return reposicion;
    }

    public void setReposicion(double reposicion) {
        this.reposicion = reposicion;
    }

    public double getCantiactual() {
        return cantiactual;
    }

    public void setCantiactual(double cantiactual) {
        this.cantiactual = cantiactual;
    }

    public ClsCajaChica(double reposicion) {
   
        this.reposicion = reposicion;
    }

    public ClsCajaChica() {
        this.reposicion = 0;
        this.cantiactual = this.totalcajachica;
    }

    public void reposicion (){
        this.reposicion=this.totalcajachica-this.cantiactual;
    }
    
    public boolean comprobacion(double compra, ClsCajaChica caja){    
        if( compra <=caja.getCantiactual() ){
            caja.reposicion();
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "reposicion=" + reposicion + ", cantiactual=" + cantiactual;
    }

}
