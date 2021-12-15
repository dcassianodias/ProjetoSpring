package br.com.primeiroprojetospring.inicializacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.primeiroprojetospring.domain.Acessorio;
import br.com.primeiroprojetospring.domain.Aluno;
import br.com.primeiroprojetospring.domain.Chave;
import br.com.primeiroprojetospring.domain.Documento;
import br.com.primeiroprojetospring.domain.Fabricante;
import br.com.primeiroprojetospring.domain.Permissao;
import br.com.primeiroprojetospring.domain.Role;
import br.com.primeiroprojetospring.domain.Usuario;
import br.com.primeiroprojetospring.repository.AlunoRepository;
import br.com.primeiroprojetospring.service.AcessorioService;
import br.com.primeiroprojetospring.service.ChaveService;
import br.com.primeiroprojetospring.service.CurrentUserDetailsService;
import br.com.primeiroprojetospring.service.DocumentoService;
import br.com.primeiroprojetospring.service.FabricanteService;
import br.com.primeiroprojetospring.service.PermissaoService;
import br.com.primeiroprojetospring.service.RoleService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

	
	@Autowired
	private AlunoRepository alunoService;
	
	@Autowired
	private FabricanteService fabricanteService;

	@Autowired
	private ChaveService chaveService;

	@Autowired
	private AcessorioService acessorioService;

	@Autowired
	private DocumentoService documentoService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private CurrentUserDetailsService usuarioService;
	
	@Autowired
	private PermissaoService permissaoService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Julia");
		alunoService.save(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Juliano");
		alunoService.save(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Antônio");
		alunoService.save(aluno3);

		Chave chave1 = new Chave();
		chave1.setCodigo("15421");
		chaveService.salvar(chave1);

		Chave chave2 = new Chave();
		chave2.setCodigo("66564");
		chaveService.salvar(chave2);

		Chave chave3 = new Chave();
		chave3.setCodigo("33321");
		chaveService.salvar(chave3);

		Chave chave4 = new Chave();
		chave4.setCodigo("2333");
		chaveService.salvar(chave4);

		Fabricante f1 = new Fabricante();
		f1.setNome("FIAT");
		f1.setPais("ITALIA");
		fabricanteService.salvar(f1);

		Fabricante f2 = new Fabricante();
		f2.setNome("BMW");
		f2.setPais("ALEMANHA");
		fabricanteService.salvar(f2);

		Fabricante f3 = new Fabricante();
		f3.setNome("OPEL");
		f3.setPais("EUA");
		fabricanteService.salvar(f3);

		Documento doc1 = new Documento();
		doc1.setCodigo("1232");
		doc1.setNome("ABC");
		documentoService.salvar(doc1);

		Documento doc2 = new Documento();
		doc2.setCodigo("33321");
		doc2.setNome("ASS");
		documentoService.salvar(doc2);

		Documento doc3 = new Documento();
		doc3.setCodigo("3468");
		doc3.setNome("PPA");
		documentoService.salvar(doc3);

		Acessorio a1 = new Acessorio();
		a1.setNome("Teto Solar");
		acessorioService.salvar(a1);

		Acessorio a2 = new Acessorio();
		a2.setNome("Vidro Eletrico");
		acessorioService.salvar(a2);

		Acessorio a3 = new Acessorio();
		a3.setNome("Banco Couro");
		acessorioService.salvar(a3);
		
		Usuario usuario = new Usuario();
		usuario.setNomeCompleto("Danilo Dias");
		usuario.setLogin("admin");
		usuario.setPassword(new BCryptPasswordEncoder()
				.encode("1234"));
		
		Role roleAdmin = new Role();
		roleAdmin.setNomeRole(Role.ROLE_ADMIN);
		roleService.salvar(roleAdmin);
		
		usuario.setRoles(Arrays.asList(roleAdmin));
		usuarioService.salvar(usuario);
		
	//##############################################
		
		Usuario usuario2 = new Usuario();
		usuario2.setNomeCompleto("Thabata Dias");
		usuario2.setLogin("thabata");
		usuario2.setPassword(new BCryptPasswordEncoder()
				.encode("1234"));
		
		Role roleUser = new Role();
		roleUser.setNomeRole(Role.ROLE_USER);
		roleService.salvar(roleUser);
		
		usuario2.setRoles(Arrays.asList(roleUser));
	
		Permissao permissaoUser = new Permissao();
		permissaoUser.setNomePermissao(Permissao.INSERT);
		permissaoService.salvar(permissaoUser);
		
		usuario2.setPermissoes(Arrays.asList(permissaoUser));
		
		usuarioService.salvar(usuario2);
		//#######################################
		//#######################################
		
		Usuario usuario3 = new Usuario();
		usuario3.setNomeCompleto("Viviane Dias");
		usuario3.setLogin("viviane");
		usuario3.setPassword(new BCryptPasswordEncoder()
				.encode("1234"));		
		
		roleService.salvar(roleUser);
		
		usuario3.setRoles(Arrays.asList(roleUser));		
		
		usuarioService.salvar(usuario3);
	}
}