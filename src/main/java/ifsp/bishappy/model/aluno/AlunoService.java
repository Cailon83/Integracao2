package ifsp.bishappy.model.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public void salvar (DadosCadastroAluno dados) {
		alunoRepository.save( new Aluno(dados));
	}
	
	public Aluno getAlunoByIdMapper (Long id) {
		var aluno =  alunoRepository.getReferenceById(id);
		System.out.println(aluno.getId());
		return aluno; //alunoMapper.alunoToDto(aluno);
	}
	
	public Aluno getAlunoById (Long id) {
		var aluno =  alunoRepository.getReferenceById(id);
		return aluno;
	}
	
	public List<Aluno> listarAlunos() {
		var alunos = alunoRepository.findAll();
		return alunos;  //  alunoMapper.listaDtos(alunos);
	}
	
	public List<Aluno> listarPorAlunos(String nome) {
		List <Aluno> alunos = alunoRepository.findByNomeStartsWith(nome);
		return alunos;  //  alunoMapper.listaDtos(alunos);
	}
	
	public void apagarUmAluno (Long id) {
		alunoRepository.deleteById(id);
	}
	
}
