
package handlingExceptions;

public class ExceptionA {
    public void doA(int k) throws Exception{
        for (int i = 0; i < 10; i++){
            if(i==k) throw new Exception("Index of k is " +i);
        }
    }
    public void doB(boolean f){
        if(f){
            doA(15);//Unresolved compilation problem
        }
        else return;
    }
    public static void main (String args[]){
        ExceptionA a = new ExceptionA();
        a.doB(args.length > 0);
    }
}