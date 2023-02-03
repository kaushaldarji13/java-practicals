package StringClass;

import java.util.Locale;

public class StringClassEx6 {

    public static void main(String[] args) {
        String s = "ababab";
        String ss = "      KAUSHAL     ";
        System.out.println(s.replace('a' , 'b'));


        // toLowerCase() and toUpperCase()
        System.out.println(s.toUpperCase(Locale.ROOT));

        // trim() removes before and after space of string
        System.out.println(ss.toLowerCase().trim());

        // indexOf(); and lastIndexOf();
        String a = "kaushal";
        System.out.println("first 'a' in string:- "+a.indexOf('a'));
        System.out.println("from last 'a' in string:- "+a.lastIndexOf('a'));

    }
}
