import java.util.InputMismatchException;

class CustomInputMismatchException extends InputMismatchException {
	public CustomInputMismatchException(String m){
		super(m);	
	}
	public String message(){
		return super.getMessage() + " Invalid input type. Please enter an integer.";
	}
}

//Custom exception class for input mismatches
