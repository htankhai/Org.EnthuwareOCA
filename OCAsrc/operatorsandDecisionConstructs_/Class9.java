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
public class Class9 {
    public static void main(String[] args){
        int i = 1234567890;
    float f = i;//precision loss in  from int to float and double
    double d = i;
        System.out.println(f);
        System.out.println(d);
        System.out.println(i - (int)f);
    }
}
