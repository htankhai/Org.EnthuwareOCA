
package javaBasics;

//java Basics1 one
public class Basics1 {
    public static void main(String[] args){
        try{
            int i =0;
            i = Integer.parseInt(args[0]);//
            
        }
        catch(NumberFormatException e ){
            System.out.println("Problem in  " + i);//i in catch block and unreachable from try block
        }
    }
}
