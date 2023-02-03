public class OverloadedConstructor {
    OverloadedConstructor(){
        this(10);
        System.out.println("no-args");
    }
    OverloadedConstructor(int i){
        this(10.5);
        System.out.println("int args");
    }
    OverloadedConstructor(double d ){
        System.out.println("Double-args");
    }

    public static void main(String[] args) {
        OverloadedConstructor o1 = new OverloadedConstructor();
        OverloadedConstructor o2 = new OverloadedConstructor(10);
        OverloadedConstructor o3 = new OverloadedConstructor(10.5);
        OverloadedConstructor o4 = new OverloadedConstructor(10l);

    }

}
