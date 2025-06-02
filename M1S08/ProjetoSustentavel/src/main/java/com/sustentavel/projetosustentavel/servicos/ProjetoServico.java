package com.exemplo.sustentabilidade.servicos;

import com.exemplo.sustentabilidade.entidades.Projeto;;
import com.sustentavel.projetosustentavel.repositorios.ProjetoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServico {

    @Autowired
    private ProjetoRepositorio projetoRepository;

    public Projeto criar(Projeto projeto) {
        return projetoRepository.save(projeto); // Adicionando o metodo para criar projeto - ex.02 (crud - create))
    }

    public List<Projeto> listar() {
        return projetoRepository.findAll(); // Adicionando o metodo para listar projetos - ex.02 (crud - read))
    }

    public Projeto buscarPorId(Long id){
        return projetoRepository.findById(id).orElse(null); // Adicionando o metodo para buscar por ID - ex.02 (crud - read))
    }

    public Projeto atualizar(Long id, Projeto projeto){
        if(projeto.getId() != null){
            Projeto old = buscarPorId(projeto.getId());
            if(old != null)
                projetoRepository.setId(old.getId());
        } else{
            projeto.setId(null);
        }
        return projetoRepository.save(projeto); // Adicionando o metodo para atualizar projeto - ex.02 (crud - update))
    }

    public void deletar(Long id){
        projetoRepository.deleteById(id); // Adicionando o metodo para deletar projeto - ex.02 (crud - delete))
    }
    public List<Projeto> buscarPorRegiaoENomeOrganizacao(String regiao, String nomeOrganizacao){
        return projetoRepository.findByRegiaoAndNomeOrganizacao(regiao, nomeOrganizacao); // Adicionando o metodo para buscar por regiao e nome da organizacao - ex.04
    }
}