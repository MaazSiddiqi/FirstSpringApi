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

    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to my first Java Spring API! 🎉";
    }

    @GetMapping("/animal")
    public Animal getAnimalbyId(@RequestParam long id) {
        return animalService.getAnimalbyId(id);
    }

    @GetMapping("/animals")
    public ArrayList<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{name}")
    public Animal getAnimalbyName(@PathVariable String name) {
        return animalService.getAnimalbyName(name);
    }

}
