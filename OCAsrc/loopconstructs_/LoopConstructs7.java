package loopconstructs_;

public class LoopConstructs7 {
    int x = 5;
    int getX(){     return x;}
    
    public static void main(String[] args)throws Exception{
        LoopConstructs7 lc = new LoopConstructs7();
        lc.looper();
        System.out.println(lc.x);
        
    }
    
    public void looper(){
        int x = 0;
        while (( x = getX()) ! = 0){
            for (int m = 10 ; m & gt ; = 0; m--) {
            x = m;
        }
    }
    }
}

