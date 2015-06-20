package loopconstructs_;

public class LoopConstructs3 {
     public static void main (String args[]){
         int count = 0, sum = 0;
         
         do{
             if(count % 3 == 0) continue;//whether == 0 and pass next 
             sum+= count;
         }
         while (count++ < 11);
          System.out.println(sum);
         }
     }

