package com.martimiano.CatalogodeLivros.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martimiano.CatalogodeLivros.Model.BibliotecarioModel;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioModel, Long> {

}
