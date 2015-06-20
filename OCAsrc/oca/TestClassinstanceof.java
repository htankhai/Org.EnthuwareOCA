package oca;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htan
 */
class A implements T1, T2{}
class B extends A implements T1{}
interface T1{}
interface T2{}

public class TestClassinstanceof{
public static void main(String[] args)
{
A a = new A();
B b = new B();
    System.out.println((a instanceof T1));
    System.out.println((a instanceof T2));
    System.out.println((b instanceof T1));
    System.out.println((b instanceof T2));
}
}


