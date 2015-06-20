
package array;
public class ArrayClass1 {
    
    public static int[] getArray() {
        return null;
        }
    
    public static void main(String[] args){
        int index = 1;
        
       try{
        //  getArray();
        //array reference expression
           getArray()[index=3]++;
       }
       catch(Exception e ) {}
       
        System.out.println("index = " + index);
        
        }
    }
            

