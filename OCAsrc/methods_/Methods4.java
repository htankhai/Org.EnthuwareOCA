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
public class Methods4 {
    public static void main(String args[]){
        Object a,b,c;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(""+ c + " "+a +" "+ b);
    }
}
