package com.sustentavel.projetosustentavel.repositorio;

import com.sustentavel.projetosustentavel.entidades.Organizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepositorio extends JpaRepository<Organizacao, Long> { 
  @Query("SELECT p FROM Projeto p WHERE " +
        "(:regiao IS NULL OR LOWER(p.regiao) LIKE LOWER(CONCAT('%', :regiao, '%'))) AND" +
         "(:nomeOrganizacao IS NULL OR LOWER(p.organizacao.nome) LIKE LOWER(CONCAT('%', :nomeOrganizacao, '%')))")
  List<Projeto> findByRegiaoAndNomeOrganizacao(@Param("regiao") String regiao, @Param("nomeOrganizacao") String nomeOrganizacao); // Adicionando o metodo para buscar por regiao e nome da organizacao - ex.04
}