package StringBuffer;

public class StringBufferDemo2 {
    public static void main(String[] args) {

        // length() ; capacity() ; charAt(int index)
        StringBuffer sb = new StringBuffer("Kaushal");
        System.out.println(sb.charAt(3));
        System.out.println(sb.charAt(6));

        //setCharAt(int index,char ch);
        sb.setCharAt(3,'z');
        System.out.println(sb);

        // append();
        StringBuffer sb1 = new StringBuffer();
        sb1.append("PI value is :-");
        sb1.append(3.14);
        sb1.append(true);
        System.out.println(sb1);

        //insert(int index, string/int/double/char/boolean )

        StringBuffer sb2 = new StringBuffer("----");
        System.out.println(sb2.insert(2,"Android developer"));

        // delete(int begin,int end) ; deleteCharAt(int index)

        System.out.println(sb2.delete(3,8));

        // reverse();
        StringBuffer sb3 = new StringBuffer("malayalam");
        System.out.println(sb3.reverse());

        // setLength();
        StringBuffer sb4 = new StringBuffer("iamaandroiddeveloper");
        sb4.setLength(9);
        System.out.println(sb4);

        // ensureCapacity(); to increase the capacity of string buffer

        StringBuffer sb5 = new StringBuffer();
        System.out.println( sb5.capacity());
        sb5.ensureCapacity(555);
        System.out.println(sb5.capacity());


        // trimToSize(); to set capacity same as string passed
        sb5.append("kaushal");
        sb5.trimToSize();
        System.out.println(sb5.capacity());

        Boolean x = new Boolean("yes");
        Boolean y = new Boolean("no");
        System.out.println(x.equals(y));


    }
}
