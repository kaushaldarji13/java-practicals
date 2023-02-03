package EqualsMethod;

public class Demo {
    public static void main(String[] args) {
        String s1 = new String("Kaushal");
        String s2 = new String("Kaushal");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Kaushal");
        StringBuffer sb2 = new StringBuffer("Kaushal");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

    }


}




