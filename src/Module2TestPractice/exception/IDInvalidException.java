package Module2TestPractice.exception;

public class IDInvalidException extends Exception{
    public IDInvalidException (){
    }
    public IDInvalidException (String errorMessage){
        super(errorMessage);
    }

}
