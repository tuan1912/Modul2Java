package exception;

public class DescriptionIsTooLong extends Exception{
    String errorMessage;
    public DescriptionIsTooLong(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        System.out.println(errorMessage);
        return errorMessage;
    }



}
