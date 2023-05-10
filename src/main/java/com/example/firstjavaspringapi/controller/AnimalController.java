package com.example.firstjavaspringapi.controller;

import com.example.firstjavaspringapi.model.Animal;
import com.example.firstjavaspringapi.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
