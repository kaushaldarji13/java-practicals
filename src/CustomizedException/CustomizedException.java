package CustomizedException;

//defining custom exception for our requirement
class TooYoungException extends RuntimeException{
    TooYoungException(String s)
    {
        // to make description available to default exception handler
        super(s);
    }

}
class TooOldException extends RuntimeException{
    TooOldException(String s)
    {
        super(s);
    }

}


public class CustomizedException {
    public static void main(String[] args) {
        int age = 15;
        if (age > 60)
        {
            throw new TooYoungException("pls wait some more time, definitely you will get better match");
        }

        else if (age < 18)
        {
            throw new TooOldException("your age already crossed marriage age and no chance of getting marriage ");
        }
        else
        {
            System.out.println("you will get match  detail soon by email!!");
        }
    }
}
