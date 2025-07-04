package com.tulipa.flor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tulipa.flor.modelo.Professor;

public interface ProfessorRepository extends JpaRepository <Professor, Long>{
    
}
