package Serialization;

import java.io.*;
// serialization wrt inheritance case-2

class Animal1  {
    int i = 10;
    Animal1(){
        System.out.println("Animal constructor called");
    }
}

class Dogg1 extends Animal1 implements Serializable{
    int j = 20;
    Dogg1(){
        System.out.println("Dog constructor called");
    }
}
public class SerializationDemo4 {

    public static void main(String[] args) throws Exception {
        Dogg1 d1 = new Dogg1();
        d1.i = 888;
        d1.j = 999;
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dogg1 d2 = (Dogg1)ois.readObject();


        System.out.println(d2.i +"...."+d2.j);
    }


}
