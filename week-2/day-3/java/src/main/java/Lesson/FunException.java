package Lesson;

public class FunException extends Exception {

    public FunException(){
        super("Have fun now!");
    }
    public FunException(String s) {
        // this super keyword represent the constructor for our Exception class
        // we pass the String s parameter into it as an argument
        super(s);
    }


}
