package Autoboxing;

public class Demo3 {
    public static void main(String[] args) {

       // 1st case:-
        Integer x= new Integer(10);
        Integer y= new Integer(10);
        System.out.println(x==y);

        // 2nd case:-
        Integer a = new Integer(10);
        Integer b =10;
        System.out.println(a==b);

        //3rd case:-
        Integer C = 10;
        Integer D = 10;
        System.out.println(C==D);

        //4th case :-
        Integer E = 100;
        Integer F = 100;
        System.out.println(E==F);

        //5th case :-
        Integer G = 1000;
        Integer H = 1000;
        System.out.println(G==H);
    }
}
