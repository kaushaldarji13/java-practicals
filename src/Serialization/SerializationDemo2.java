package Serialization;

import java.io.*;

class Account implements Serializable{
    String username = "kaushal";
    transient String password = "admin12#";


    private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();

        String epwd = "123" + password;

        os.writeObject(epwd);
    }

    private void readObject(ObjectInputStream is)throws Exception{
        is.defaultReadObject();
        String epwd = (String) is.readObject();
        password = epwd.substring(3);

    }


}
public class SerializationDemo2 {

    public static void main(String[] args) throws Exception{
        Account a1 = new Account();
        System.out.println(a1.username+ " "+a1.password);

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account) ois.readObject();

        System.out.println(a2.username +" "+a2.password);

    }
}
