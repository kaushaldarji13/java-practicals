package StringClass;

public class StringClassEx7 {

    //bcz of runtime operation if there is change in content then with
    //those changes a new object will be created on the heap.
    //if there is no change in content then existing obj will be reused and new obj won't be created
    public static void main(String[] args) {
        String s1 = new String("kaushal");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }

}
