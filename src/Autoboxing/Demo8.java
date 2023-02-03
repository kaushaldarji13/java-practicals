package Autoboxing;

import java.util.Locale;

public class Demo8 {

        public static void main(String[] args) {

            String s1 = new String("lower");
            String s2 = new String("LOWER");
            String s3 = new String("UPPER");

            System.out.println(s1.toUpperCase().equals(s2)+" " +s1.toUpperCase().replace("LOWER","UPPER").equals(s3));
        }

}
