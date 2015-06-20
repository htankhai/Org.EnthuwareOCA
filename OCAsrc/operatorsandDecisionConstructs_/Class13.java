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
public class Class13 {
    public static void main(String[] args){
        int d = 0;
        try{
            int i = 1 / d * doIt());
        }catch (Exception e){
            System.out.println(e);
            
        }
    }
    public static int doIt () throws Exception{
        throw new Exception ("Forget about it");
    }
}
