package Module2TestPractice.exception;

public class AccountInvalidException extends Exception{
    public AccountInvalidException (){
    }
    public AccountInvalidException (String errorMessage){
        super(errorMessage);
    }
}
