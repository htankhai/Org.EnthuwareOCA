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
public class Class10 {
    public static void main(String[] args){
        char c;
        int i ;
         c = 'a';
         i = c;
         System.out.println(i);
         i++;
         
         c = (char)i;
         c = i;
         c++;
         c = (char)30L;
         c = 30L;
    }
}
