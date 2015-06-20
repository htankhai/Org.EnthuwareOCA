package javaBasics;

class basics2A {
    public basics2A(){}
    public basics2A(int i)
    {
        System.out.println(i);
    }}

class basics2B {
    static  basics2A s1 = new basics2A(1);
    basics2A a = new basics2A(2);
  
    public static void main(String[] args){
        basics2B b =new basics2B();
        basics2A a = new basics2A(3);
    }
    static basics2A s2 = new basics2A(4);
}