package Module2TestPractice.exception;

public class AccountDuplicateException extends Exception{
    public AccountDuplicateException (){
    }
    public AccountDuplicateException (String errorMessage){
        super(errorMessage);
    }

}
