package StringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("aaaaaaaaaaaaaaaaa");
        sb.append("aaaaaaaaaaaaaaaaaa");
        System.out.println(sb.capacity());
    }
}
