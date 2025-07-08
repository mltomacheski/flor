package com.tulipa.flor.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import com.tulipa.flor.dto.ProfessorDto;
import com.tulipa.flor.modelo.Professor;
import com.tulipa.flor.repository.ProfessorRepository;


@RestController //Transforma a nossa classe em um controller antigamente chamado de bean 
@RequestMapping(value = "/professor") // Mapeando a url, navegador chama pelo valor 
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping( value = "/imprimir")  // Mapeamento do método imprimir. Usando o verbo Get => Pegar ou Buscar 
    public void imprimir() { // void=> Não retorna nada 
        System.out.println("Chamou o metodo imprimir");
    }

    @GetMapping( value = "/ola")
    public String ola() { // Adicinado retorno como String - Tipo texto // Não quer dizer html  
        return"<h1>Mari<h1>"; // return => Devolve o retorno para quem chamou 
    }


    @GetMapping( value =  "/listaprofessor") 
    public List<Professor> findAll(){
        return professorRepository.findAll();

    }

    @PostMapping(value = "/insert")
    public ResponseEntity<?> insert(@RequestBody ProfessorDto professorDto) {

        Professor professor = professorDto.novoProfessor();
        
        professorRepository.save(professor);

        System.out.println(professor.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                                            .path("/id")
                                            .buildAndExpand(professor.getId())
                                            .toUri();

        return ResponseEntity.created(uri).body(professor);
    }






}