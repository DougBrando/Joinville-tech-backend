package com.sustentavel.projetosustentavel.controladores;

import com.sustentavel.projetosustentavel.entidades.Organizacao;
import com.sustentavel.projetosustentavel.repositorio.OrganizacaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizacoes")
public class OrganizacaoController {

    @Autowired
    private OrganizacaoService organizacaoService;

    @PostMapping
    public Organizacao criarOrganizacao(@RequestBody Organizacao organizacao) { // Adicionando o metodo para criar organizacao - ex.02
        return organizacaoService.criar(organizacao);
    }

    @GetMapping
    public List<Organizacao> listarOrganizacoes(@RequestParam(required = false) String nome, @RequestParam(required = false) String contato{
        return organizacaoService.buscarPorNomeEContato(nome, contato); // Adicionando o metodo para buscar por nome e contato - ex.03 (consulta personalizada)
    }

    @GetMapping
    public List<Organizacao> listarOrganizacoes() { 
        return organizacaoService.listar(); // Adicionando o metodo para listar organizacoes - ex.02 - (crud - read))
    }

    @GetMapping("/{id}")
    public Organizacao buscarOrganizacaoPorId(@PathVariable Long id)
        return organizacaoService.buscarPorId(id); // Adicionando o metodo para buscar por ID - ex.02 - (crud - read))
    }

    @PutMapping("/{id}")
    public Organizacao atualizarOrganizacao(@PathVariable Long id, @RequestBody Organizacao organizacao){
        return organizacaoService.atualizar(id, organizacao); // Adicionando o metodo para atualizar organizacao - ex.02 - (crud - update))
    }

    @DeleteMapping("/{id}")
    public void deletarOrganizacao(@PathVariable Long id){ 
        organizacaoService.deletar(id); // Adicionando o metodo para deletar organizacao - ex.02 - (crud - delete))
    }
}