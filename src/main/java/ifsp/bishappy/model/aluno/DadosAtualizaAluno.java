package ifsp.bishappy.model.aluno;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaAluno(
		@NotNull
		long id,
		String nome, 
		String etnia,
		LocalDate dataNascimento,
		String cidade, 
		String email,
		String contatoEmergencia, 
		String curso) {

}
