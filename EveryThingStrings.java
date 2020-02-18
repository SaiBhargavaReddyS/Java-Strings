/**
 * EveryThingStrings
 */
public class EveryThingStrings {

    public static void main(String args[]) {
        System.out.print("Everyting Strings");
        //StringClass s= new StringClass();
        StringBufferClass s= new StringBufferClass();
        s.Disp();
        
    }

    /**
     * StringClass
     */
    static public class StringClass {
    //these are immutable

        void Disp()
        {
            String s="Bhargava";
            System.out.println(s);
            System.out.println("length: "+s.length());
            System.out.println("lower case: "+s.toLowerCase());
            System.out.println("upper case: "+s.toUpperCase());
            System.out.println("char at: "+s.charAt(0));
            System.out.println("index of B: "+s.indexOf('B'));
            System.out.println("last index of A"+s.lastIndexOf('a'));
            System.out.println("concat :"+s.concat(s));
            System.out.println("ContentEquals :"+s.contentEquals(s));
            System.out.println("just equals :"+s.equals("bhargava"));//unequal because of case change
            System.out.println("equals Ignore case :"+s.equalsIgnoreCase("bhargava"));
            System.out.println("just == : "+ s==s);
            System.out.println("starts with :"+s.startsWith("bha"));
            System.out.println("ends with :"+s.startsWith("ava"));
            System.out.println(s+"compared to bhagi :"+s.compareTo("bhagi"));
            System.out.println(s+"compared to bhagi ignore case :"+s.compareToIgnoreCase("bhagi"));
            System.out.println("replace a with *"+s.replace('a', '*'));
            System.out.println("sub string : "+s.substring(0,5));
        }

    }
    /**
     * StringBufferClass
     */
    public static class StringBufferClass {
    
        void Disp(){
        StringBuffer s=new StringBuffer("Bhargava");
        System.out.println("length :"+s.length());
        System.out.println("capacity :"+s.capacity());
        System.out.println("reverse :"+s.reverse());
        System.out.println("append :"+s.append(s));
        System.out.println("length :"+s.length());
        
        
        
    }
}
}