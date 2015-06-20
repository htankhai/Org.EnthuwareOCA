/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package overloadingMethod;

public class Class1 {
    void probe(int... x) { System.out.println("In ...");
    }
     void probe(Integer  x) { System.out.println("In Integer ");
    }
      void probe(long  x) { System.out.println("In long ");}
       void probe(Long  x) { System.out.println("In Long ");
       }
       
       public static void main (String[] args) {
           Integer a = 4;
           new Class1().probe(a);
           int b = 4; new Class1().probe(b);
       
       }
}
