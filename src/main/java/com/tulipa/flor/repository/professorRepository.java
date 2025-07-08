package com.tulipa.flor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tulipa.flor.modelo.Professor;

public interface ProfessorRepository extends JpaRepository <Professor, Long>{
    
    @Query ( value = "select * from professor where nome like ?", nativeQuery =   true )
    public Professor findByNome(String nome);


}
