package Externalization;

import java.io.*;

class ExternalizationDemo implements Externalizable {

    String s ;
    int i;
    int j;

    ExternalizationDemo(String s, int i , int j){
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public ExternalizationDemo(){
        System.out.println("public no-arg constructor");
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(s);
        objectOutput.writeInt(i);
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        s = (String) objectInput.readObject();
        i = objectInput.readInt();
    }


    public static void main(String[] args) throws Exception {
        ExternalizationDemo t1 = new ExternalizationDemo("Kaushal",10,20);

            FileOutputStream fos = new FileOutputStream("abcd.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t1);

            FileInputStream fis = new FileInputStream("abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ExternalizationDemo t2 = (ExternalizationDemo) ois.readObject();

        System.out.println(t2.s+".."+t2.i+".."+t2.j);


    }
}
