/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

/**
 *
 * @author Estudiantes
 */
public class Calculadora1 {

    protected float x;
    private float y;
    private float r;

    void sumar() {

        r = x + y;
    }

    void restar() {
       
        r = x - y;
    }
    
   public void setx(int x){
       this.x=x;
   }
   
   public void sety(int y){
       this.y=y;
   }
   
   public void getr(int r){
       return r;
   }

    void setX(int entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setY(int entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
