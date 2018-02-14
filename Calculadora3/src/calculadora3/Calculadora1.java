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
    protected float y;
    protected float r;

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
   
   public void setX(float x){
       this.x=x;
   }
   
   public void setY(float y){
       this.y=y;
   }
   
   public float getR(){
       return this.r;
   }

   
   
}
