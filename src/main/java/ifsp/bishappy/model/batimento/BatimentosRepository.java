package ifsp.bishappy.model.batimento;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BatimentosRepository extends JpaRepository<Batimentos, Long> {

	List<Batimentos> findAllByAlunoId (Long id);

}
