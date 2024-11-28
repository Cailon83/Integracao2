package ifsp.bishappy.controller;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AlunoExceptionHandler {
	
//	@ExceptionHandler(ImpossivelExcluirAlunoException.class)
//	public ResponseEntity<String> handleResourceNotFoundExection (ImpossivelExcluirAlunoException ex){
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
//	}
	
//	@ExceptionHandler(ImpossivelExcluirAlunoException.class)
//	public ResponseEntity <String> handleNotFoundException (NotFoundException ex){
//		return ResponseEntity.status(HttpStatus.NOT_FOUND)
//				.body("Recurso não encontrado: " + ex.getMessage());
//	}

}
