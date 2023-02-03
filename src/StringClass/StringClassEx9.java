package StringClass;

public class StringClassEx9 {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("kaushal");

        //immutability applicable for objects so  we can modify the object
        sb.append(" Android");
        System.out.println(sb);

        // reassignment is not allowed due to final
        //        sb = new StringBuffer("Developer");
    }
}
