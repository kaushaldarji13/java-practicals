package Autoboxing;

public class Demo7 {
    public static void main(String[] args) {
        String s1 = new String("kaushal");
        String s2 = new String("kaushal");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        StringBuffer sb1 = new StringBuffer("kaushal");
        StringBuffer sb2 = new StringBuffer("kaushal");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        
    }
}
