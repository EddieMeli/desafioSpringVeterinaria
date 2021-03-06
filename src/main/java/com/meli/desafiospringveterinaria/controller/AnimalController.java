package com.meli.desafiospringveterinaria.controller;
import com.meli.desafiospringveterinaria.model.Animal;
import com.meli.desafiospringveterinaria.services.DAOAnimal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class AnimalController {

    DAOAnimal daoAnimal = new DAOAnimal();

    @PostMapping("/cadastrar")
    public ResponseEntity<Animal> cadastrarAnimal(@RequestBody Animal objAnimal){
        daoAnimal.cadastrar(objAnimal);
        return ResponseEntity.ok(objAnimal);
    }

    @GetMapping("/consultar")
    public List<Animal> listarAnimal(){
        List<Animal> listaDeAnimal = daoAnimal.listagem();
        return listaDeAnimal;
    }

    @PutMapping("/editar")
    public void atualizarAnimal(){
        return;
    }

}

