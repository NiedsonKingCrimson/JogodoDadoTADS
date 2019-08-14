/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadores;


public class Dado {
    private int Face;
      public int getFace(){
         return Face;
        }

 

   public void setFace (){
     Face =  (int) (1 + Math.random() * 6 );
    }
 }