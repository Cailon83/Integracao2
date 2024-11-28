package ifsp.bishappy.controller;

public class ImpossivelExcluirAlunoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ImpossivelExcluirAlunoException (String message) {
		super(message);
	}

}
