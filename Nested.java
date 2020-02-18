/**
 * Nested
 */
public class Nested {
    int k=10;

    /**
     * InnerNested
     */
    public class InnerNested {//this should be declared statis to access
    
        void disp()
        {
            System.out.print(k);
        }
    }
    public static void main(String a[]) {
        Nested nt= new Nested();
        InnerNested n= nt.new InnerNested();//inner class instances to be created in this way
        n.disp();
        
    }
}