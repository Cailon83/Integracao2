package ifsp.bishappy.model.aluno;

import java.time.LocalDateTime;

public class ErrorMessage {
	private String descricao;
	private int status;
	private String exceptionMessage;
	private LocalDateTime timestamp;
	
	public ErrorMessage (String descricao, int status, String exceptionMessage) {
		this.descricao = descricao;
		this.status = status;
		this.exceptionMessage = exceptionMessage;
		this.timestamp = LocalDateTime.now();
	}
}
