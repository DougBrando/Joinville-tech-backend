package com.sustentavel.projetosustentavel.repositorio;

import com.sustentavel.projetosustentavel.entidades.Organizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizacaoRepositorio extends JpaRepository<Organizacao, Long> { 
    @Query("SELECT o FROM Organizacao o " +
           "WHERE (:nome IS NULL OR LOWER(o.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) " +
           "AND (:contato IS NULL OR LOWER(o.contato) LIKE LOWER(CONCAT('%', :contato, '%')))")
    List<Organizacao> findByNomeAndContato(@Param("nome") String nome, @Param("contato") String contato); // Adicionando o metodo para buscar por nome e contato - ex.03
  
}