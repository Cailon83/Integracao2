package ifsp.bishappy.model.aluno;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
  List <Aluno> findByNomeStartsWith (String nome);
// default List<Aluno> carregarPorNomeAluno (String nomeAluno){
//	 return this.findByAlunoNome(nomeAluno);
// }
}
