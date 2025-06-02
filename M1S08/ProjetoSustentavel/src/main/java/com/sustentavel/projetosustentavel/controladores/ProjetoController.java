package com.sustentavel.projetosustentavel.controladores;

import com.sustentavel.projetosustentavel.entidades.Projeto;
import com.sustentavel.projetosustentavel.repositorio.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;


    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) { // Adicionando o metodo para criar projeto - ex.02 (crud - create))
        return projetoService.criar(projeto);
    }

    @GetMapping
    public List<Projeto> listarProjetos(@RequestParam(required = false) String regiao, @RequestParam(required = false) String nomeOrganizacao){ // Adicionando o metodo para buscar por regiao e nome da organizacao - ex.04 (consulta personalizada)
        return projetoService.buscarPorRegiaoENomeOrganizacao(regiao, nomeOrganizacao);
    }

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoService.listar(); // Adicionando o metodo para listar projetos - ex.02 (crud - read))
    }

    @GetMapping("/{id}")
    public Projeto buscarProjetoPorId(@PathVariable Long id){ 
        return projetoService.buscarPorId(id); // Adicionando o metodo para buscar por ID - ex.02 (crud - read))
    }

    @PutMapping("/{id}")
    public Projeto atualizarProjeto(@PathVariable Long id, @RequestBody Projeto projeto){
        return projetoService.atualizar(id, projeto); // Adicionando o metodo para atualizar projeto - ex.02 (crud - update))
    }
    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id){
        projetoService.deletar(id); // Adicionando o metodo para deletar projeto - ex.02 (crud - delete))
    }

    
    
}