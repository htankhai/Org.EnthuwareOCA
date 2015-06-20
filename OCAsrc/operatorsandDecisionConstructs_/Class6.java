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
public class Class6 {
    public static void main(String[] args){
        String a = "java";
        char[]  b = {'j', 'a', 'v', 'a'};
        String c = new String(b);//create new object
        String d = a;
       
        System.out.println(a == d);
        System.out.println(a == "java");
        System.out.println(a.equals(c));
         System.out.println( a == c);
         System.out.println(a.equals(d));
        
    }
}
