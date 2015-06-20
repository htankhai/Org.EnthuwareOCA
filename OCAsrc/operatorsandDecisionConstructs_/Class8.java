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
public class Class8 {
    public static void main(String args[]){
        Object t = new Integer(107);
       int k = (Integer) t.intValue() / 9;
       //  int k = ((Integer) t).intValue() / 9;
        System.out.println(k);
    }
}
