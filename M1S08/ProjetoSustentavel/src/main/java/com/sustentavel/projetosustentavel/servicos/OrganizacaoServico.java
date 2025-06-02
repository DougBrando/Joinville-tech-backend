package com.exemplo.sustentabilidade.servicos;

import com.exemplo.sustentabilidade.entidades.Organizacao;
import com.sustentavel.projetosustentavel.repositorios.OrganizacaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacaoServico {

    @Autowired
    private OrganizacaoRepositorio organizacaoRepository;

    public Organizacao criar(Organizacao organizacao) { // Adicionando o metodo para criar organizacao
        return organizacaoRepository.save(organizacao);
    }

    public List<Organizacao> listar() { // Adicionando o metodo para listar organizacoes
        return organizacaoRepository.findAll();
    }

    public Organizacao buscarPorId(Long id){ // Adicionando o metodo para buscar por ID - ex.02
        return organizacaoRepository.findById(id).orElse(null);
    }

    public Organizacao atualizar(Long id, Organizacao organizacao){ // Adicionando o metodo para atualizar organizacao - ex.02
            if(organizacao.getId() != null){ // Verifica se o ID da organizacao nao eh nulo
                organizacao old = buscarPorId(organizacao.getId()); // Busca a organizacao antiga pelo ID
                if(old != null) // Verifica se a organizacao antiga nao eh nula
                    organizacao.setId(old.getId()); // Define o ID da organizacao nova como o ID da organizacao antiga
            } else{ // Se o ID da organizacao for nulo
                organizacao.setId(null); // Define o ID da organizacao como nulo
            } // Salva a organizacao no banco de dados
            return organizacaoRepository.save(organizacao); // Retorna a organizacao salva
            }    // Se a organizacao nao for encontrada, retorna null
        }

        public void deletar(Long id){ // Adicionando o metodo para deletar organizacao - ex.02
            organizacaoRepository.deleteById(id); // Deleta a organizacao pelo ID
        }

        public List<Organizacao> buscarPorNomeEContato(String nome, String contato){ // Adicionando o metodo para buscar por nome e contato - ex.03
            return organizacaoRepository.findByNomeAndContato(nome, contato); 
        }
}
}