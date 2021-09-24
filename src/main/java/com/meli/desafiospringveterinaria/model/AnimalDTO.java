package com.meli.desafiospringveterinaria.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AnimalDTO {

    List<Animal> listaAnimal = new ArrayList<>();

    public void cadastrar(Animal objAnimal) {
        if (validaAnimal(objAnimal.getNumeroDoPaciente())){
            listaAnimal.add(objAnimal);
        } else {
            throw new RuntimeException("Animal já cadastrado.");
        }
    }


    public void editar(Animal obj) {

    }


    public void obter(Animal obj) {

    }

    public List<Animal> listagem() {
        return listaAnimal;
    }

    // validando se animal existe
    private boolean validaAnimal(Integer numeroAnimal){
        for(Animal animal: listagem()){
            if (animal.getNumeroDoPaciente() == (numeroAnimal)){
                return false;
            }
        }
        return true;
    }
}
