/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methods_;

/**
 *
 * @author htan
 */
public class Methods5 {
        static class Wrapper{
            int w = 10;
        }
        
        static Wrapper changeWrapper(Wrapper w){
            w = new Wrapper();
            w.w += 9;
            return w;
        }
        
        public static void main(String args[]){
            Wrapper w = new Wrapper();
            w.w =20;
            changeWrapper(w);
            w.w += 30;
            System.out.println("First output : " + w.w);
            w = changeWrapper(w);
            System.out.println("Second output : " +w.w);
        }
}
