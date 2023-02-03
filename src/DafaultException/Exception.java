package DafaultException;

public class Exception {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }

        catch (ArithmeticException e){

            //methods to print exception information

            e.printStackTrace();                //full description of method
            System.out.println(e);              // exception and message
            System.out.println(e.toString());   // exception and message
            System.out.println(e.getMessage()); // only message
        }
        catch (java.lang.Exception e ){

        }

     /*   catch (ArithmeticException e){

        }*/


    }
}
