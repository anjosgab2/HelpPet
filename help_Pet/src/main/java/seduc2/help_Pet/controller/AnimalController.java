package seduc2.help_Pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seduc2.help_Pet.entity.Animal;
import seduc2.help_Pet.service.AnimalService;

import java.util.List;


@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping
    public List<Animal> mostrar(){
        return animalService.mostrarAnimal();
    }

    @PostMapping
    public Animal cadastrar( @RequestBody Animal animal){
        return animalService.cadastrarAnimal(animal);
    }
}
