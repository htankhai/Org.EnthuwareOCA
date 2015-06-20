/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testPackage;

public class Test{
    public static void main(String args[]){
    String hello = "Hello", lo= " lo";
    System.out.println((testPackage.Other.hello == hello) + " ");
    System.out.println((other.Other.hello ==hello) + " ");
    System.out.println((hello == ("Hel" +"lo"))+ " ");
        System.out.println(("Hel" +lo)+ "");
           System.out.println(("Hel" +lo).intern());
    System.out.println((hello == ("Hel" +lo)) + " ");
    System.out.println(hello == ("Hel" + lo).intern());
}    
}
class Other {static String hello = "Hello";}
