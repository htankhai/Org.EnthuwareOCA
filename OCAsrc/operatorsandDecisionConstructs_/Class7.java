/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operatorsandDecisionConstructs_;

/**
 *
 * @author htan
 */
public class Class7 {
     public static void main( String[] args){
        int  i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        bool = (bool2 & method1(i++));
        bool = (bool2 &&  method1(i++));
        bool = (bool1 | method1(i++));
        bool = (bool1  ||  method1(i++));
        
    }
    public static boolean method1(int i){
        //System.out.println(i);
         return i > 0 ? true : false;
}
}