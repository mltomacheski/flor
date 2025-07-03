package com.tulipa.flor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulipa.flor.dto.ProfessorDto;
import com.tulipa.flor.modelo.Professor;


@RestController //Transforma a nossa classe em um controller antigamente chamado de bean 
@RequestMapping(value = "/professor") // Mapeando a url, navegador chama pelo valor 
public class ProfessorCrontroller {

    @GetMapping( value = "/imprimir")  // Mapeamento do método imprimir. Usando o verbo Get => Pegar ou Buscar 
    public void imprimir() { // void=> Não retorna nada 
        System.out.println("Chamou o metodo imprimir");
    }

    @GetMapping( value = "/ola")
    public String ola() { // Adicinado retorno como String - Tipo texto // Não quer dizer html  
        return"<h1>Mari<h1>"; // return => Devolve o retorno para quem chamou 
    }

    @GetMapping (value ="/insert")
    public String insert(@RequestBody ProfessorDto professorDto) {

        Professor professor = professorDto.novoProfessor();
        System.out.println(professor.toString());

        return"<h1>tentando salvar o professor dos alunos<h2>";
    }
}