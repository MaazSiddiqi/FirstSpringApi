package com.example.firstjavaspringapi.controller;

import com.example.firstjavaspringapi.model.Animal;
import com.example.firstjavaspringapi.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    // GET http://localhost:8080/
    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to my first Java Spring API! 🎉";
    }

    // GET http://localhost:8080/animal?id={id}
    @GetMapping("/animal")
    public Animal getAnimalbyId(@RequestParam long id) {
        return animalService.getAnimalbyId(id);
    }

    // GET http://localhost:8080/animal/{name}
    @GetMapping("/{name}")
    public Animal getAnimalbyName(@PathVariable String name) {
        return animalService.getAnimalbyName(name);
    }

    // GET http://localhost:8080/animals
    @GetMapping("/animals")
    public ArrayList<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    // POST http://localhost:8080/animal
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/animal")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    // PUT http://localhost:8080/animal/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/animal/{id}")
    public void updateAnimal(@RequestBody Animal animal, @PathVariable long id) {
        animalService.updateAnimal(animal, id);
    }

    // DELETE http://localhost:8080/animal/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/animal/{id}")
    public void deleteAnimal(@PathVariable long id) {
        animalService.deleteAnimal(id);
    }
}
