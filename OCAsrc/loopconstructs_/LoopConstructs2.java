package loopconstructs_;

public class LoopConstructs2 {
    public static void main (String args[]){
        int var = 20, i = 0;
        
        do{
            while(true)
            {
                if(i++> var) break;
            }
        }
        while(i< var--);
        System.out.println(var);
            }
        }
    