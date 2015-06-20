/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaBasics;

public class InstanceStaticVariableClass {
    int i1;
    static int i2;
    public void method1(){
        int i;
        i = this.i1;
        i = this.i2;
        this.i1 = i2;
    }
}
