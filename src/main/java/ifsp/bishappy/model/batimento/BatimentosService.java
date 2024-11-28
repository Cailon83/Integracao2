package ifsp.bishappy.model.batimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatimentosService {
	
	@Autowired
	private BatimentosRepository batimentosRepository;
	
	@Autowired
	public BatimentosService(BatimentosRepository batimentosRepository) {
		this.batimentosRepository = batimentosRepository;
	}
	
	public List <Batimentos> getAll() {
		return batimentosRepository.findAll();
	}
	
	public List<Batimentos> listarBatimentosAluno(long id) {
		//como procurar todos os batimentos de um determinado aluno
		return batimentosRepository.findAllByAlunoId (id);
	}
	
	
	
}
