package seduc2.help_Pet.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seduc2.help_Pet.entity.Animal;
import seduc2.help_Pet.repository.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public List<Animal> mostrarAnimal(){
        List<Animal> animalList = new ArrayList<>();
        animalList =animalRepository.findAll();
        return animalList;
    }

    public Animal cadastrarAnimal(Animal animal){
        return animalRepository.save(animal);
    }

}
