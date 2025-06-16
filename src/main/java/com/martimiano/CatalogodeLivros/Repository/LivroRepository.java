package com.martimiano.CatalogodeLivros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martimiano.CatalogodeLivros.Model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{

}
