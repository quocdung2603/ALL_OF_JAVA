package bai1;

public class NumberOutOfRangeException extends Exception {

//	private static final long serialVersionUID = 1L;

	public NumberOutOfRangeException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Number is outside the computation";
	}
}
