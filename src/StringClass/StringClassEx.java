package StringClass;

public class StringClassEx {
    public static void main(String[] args) {

        // difference between String and String Buffer

        String s = new String("Android");
        s.concat("Developer");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Android");
        sb.append(" Developer");
        System.out.println(sb);
    }
}
