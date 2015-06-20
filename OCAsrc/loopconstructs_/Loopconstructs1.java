
package loopconstructs_;

public class Loopconstructs1 {
    public static void main(String args[]){
        int k = 2;
        do{
            System.out.println(k);
        }
        while(--k > 0);
        
        
         //compile   
        if(false) { }
        do{ } while(false);
        for(int i = 0; i < 0; i++) {};
        
       // while (false){ }// not compile
        
        
        for(; Math.random() < 0.5;){
            System.out.println("true");
        }
        for(;; Math.random() < 0.5){
            System.out.println("true");
        }
        
       for(; ;){
            if(Math.random() < 0.5 ) break;
            
        }
        for(; Math.random() < 0.5 ? true : false; ){
            System.out.println("true");
        }
        }
    }
