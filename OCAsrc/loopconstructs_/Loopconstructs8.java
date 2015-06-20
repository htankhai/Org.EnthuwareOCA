package loopconstructs_;

public class Loopconstructs8 {
    public static void main (String[] args){
        int  i = 0,  j =5 ;
        label: for ( ;  ; i++){
            for(; ; --j) if ( i > j) break label;
        }
            System.out.println("i = " + i+ ", j = " +j);  
        }
    }

