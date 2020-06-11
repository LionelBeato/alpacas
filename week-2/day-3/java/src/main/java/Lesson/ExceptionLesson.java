package Lesson;

public class ExceptionLesson {

    public static void main(String[] args) throws Exception {

        // today we will be talking about Exceptions
        // java api defines Exception like so:
        // The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.


        int x = 7;

//        if (x < 6){
//            throw new Exception("Exception! That number is too small.");
//        } else {
//            System.out.println("No exceptions found!");
//        }

        // below is a basic try-catch block
        // this try and catch block will attempt to resolve any code in the try section
        // the catch block will catch any specified errors
        try{
            if (x < 6){
                throw new Exception("Exception! That number is too small!");
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Hey, you did something wrong!");
        } finally {
            System.out.println("All Exceptions resolved! Have a good day");
        }
        System.out.println("This is after the exception");


        // below is an example of creating your own exception
        // we can treat this exception as any old exception
        // we can even have it created with a standard message
        try{
            throw new FunException("You're not having fun!");
        } catch (FunException f){
            f.printStackTrace();
        }

        // below is a try-catch block with default message from exception
        try{
            throw new FunException();
        } catch (FunException f){
            f.printStackTrace();
        }

    }
}
