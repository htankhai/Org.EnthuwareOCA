
package methods_;

public class Methods3_this_local {
    private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;//local
     }
    
    public void showTwo(int myValue){
        this.myValue = myValue;//current 
    }
    
    public static void main (String args[]){
        Methods3_this_local mtl = new Methods3_this_local();
        mtl.showTwo(200);
        System.out.println(mtl.myValue);
        mtl.showOne(100);
        System.out.println(mtl.myValue);
    }
}
