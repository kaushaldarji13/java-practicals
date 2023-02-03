package Serialization;

// serialization wrt inheritance case-1

import java.io.*;

class Animal implements Serializable{
    int i = 10;
}

class Dogg extends Animal{
    int j = 20;
}
public class SerializationDemo3 {

    public static void main(String[] args) throws Exception {
        Dogg d1 = new Dogg();
        System.out.println(d1.i+ " "+d1.j);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dogg d2 = (Dogg)ois.readObject();


        System.out.println(d2.i +" "+d1.j);
    }


}
