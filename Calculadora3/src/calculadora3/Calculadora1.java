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
        
          if(x<y)
        {
            float a;
            a = x;
            x = y;
            y = a;
        }
        if(x<0)
        {
            x = -x;
            y = -y;
        }
        r = x - y;
    }
    
    void multiplicar(){
        
        r = x * y;
    }
   
   public void setx(float x){
       this.x=x;
   }
   
   public void sety(float y){
       this.y=y;
   }
   
   public float getr(float r){
       return r;
   }

    void setX(float entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setY(float entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void set(int eleccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
