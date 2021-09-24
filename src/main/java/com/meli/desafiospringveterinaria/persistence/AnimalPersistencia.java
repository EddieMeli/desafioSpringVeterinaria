package com.meli.desafiospringveterinaria.persistence;


import com.meli.desafiospringveterinaria.model.Animal;
import com.meli.desafiospringveterinaria.persistence.Persistivel;
import com.meli.desafiospringveterinaria.model.AnimalDTO;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalPersistencia {
    // - Implementar a Classe DTO
    List<AnimalDTO>  listAnimal = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();
    private void mapearObjeto(){
        objectMapper.findAndRegisterModules();
        objectMapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
    }

    public AnimalDTO salvarAnimal(AnimalDTO animalDTO){
        mapearObjeto();
        listAnimal = listarAnimal();
        Persistivel pp = new Persistivel();

        if (pp.proprietarioJaCadastrado(animalDTO.getProprietario() {
            //erro
        }

        listAnimal.add(animalDTO);

        try {
            objectMapper.writeValue(new File("OutTxt.json"), listAnimal);

        }catch (IOException e){
            e.printStackTrace();
        }

        return animalDTO;

    }

}
