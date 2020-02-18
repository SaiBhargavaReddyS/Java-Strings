import java.util.Scanner;

class Empl
{
    public static String s1="the creator is bhargav";
    static String s2="    sadffds";
        public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        String k=s.nextLine();
        int l=s.nextInt();
        s.nextLine(); 
        String j=s.nextLine( );
        System.out.print(k+""+s1+" "+l+" "+j+""+s2);
        s.close();
    }
}