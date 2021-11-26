package br.com.primeiroprojetospring.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.primeiroprojetospring.domain.Aluno;
import br.com.primeiroprojetospring.domain.Professor;
import br.com.primeiroprojetospring.repository.AlunoRepository;
import br.com.primeiroprojetospring.repository.ProfessorRepository;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

	
	@Autowired
	private AlunoRepository alunoService;
	
	@Autowired
	private ProfessorRepository professorService;
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Danilo");
		alunoService.save(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Joao");
		alunoService.save(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Ingrid");
		alunoService.save(aluno3);
		
		List<Aluno> listaAluno = alunoService.findAll();
		
		for (Aluno aluno: listaAluno) {
			System.out.println(aluno.getNome());
		}
		
		Professor professor1 = new Professor();
		professor1.setNome("Marcelo");
		professorService.save(professor1);
		
		Professor professor2 = new Professor();
		professor2.setNome("Yuri");
		professorService.save(professor2);
		
		Professor professor3 = new Professor();
		professor3.setNome("Nelson");
		professorService.save(professor3);
		
		List<Professor> listaProfessor = professorService.findAll();

		for (Professor professor : listaProfessor) {
			System.out.println(professor.getNome());
		}	
		
	}

}
