package ifsp.bishappy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsp.bishappy.model.aluno.Aluno;
import ifsp.bishappy.model.aluno.AlunoRepository;
import ifsp.bishappy.model.aluno.AlunoService;
import ifsp.bishappy.model.aluno.DadosAtualizaAluno;
import ifsp.bishappy.model.aluno.DadosCadastroAluno;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("aluno")
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired 
	private AlunoRepository alunoRepository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroAluno dados) {
		alunoService.salvar(dados);
	}
	
	@GetMapping                                           
	public List<Aluno> Listagem (){    
	    return alunoService.listarAlunos();
	} 
	
	
	@GetMapping("/{id}")                                           
	public Aluno ListaUmAluno (@PathVariable Long id){  
	    return alunoService.getAlunoByIdMapper(id);          
	} 
	
	@GetMapping
	@RequestMapping ("buscarPorNome")
	public  List<Aluno> ListaUmAluno (String nome){
		 
		return alunoService.listarPorAlunos(nome);
	    		
	} 
	
	@PutMapping
	@Transactional
	public void atualizar (@RequestBody  DadosAtualizaAluno dados) {
		var aluno = alunoService.getAlunoById(dados.id());
		aluno.atualizarInformacoes(dados);
	}
	
	@DeleteMapping ("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		alunoService.apagarUmAluno(id);
		
	}
}
