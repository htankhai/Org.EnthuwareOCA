

package javaBasics;

public class SomeClass {
    String s1 = "green mile";
    String local;
    public void generateReport( int n) {
        if(n > 0) local = "good";
        else local = "bad";
        System.out.println( s1 + " = " + local);
    }
}