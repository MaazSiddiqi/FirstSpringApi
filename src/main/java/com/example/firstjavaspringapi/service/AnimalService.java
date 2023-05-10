package com.example.firstjavaspringapi.service;

import com.example.firstjavaspringapi.model.Animal;

import java.util.ArrayList;

public interface AnimalService {
    public Animal getAnimalbyId(long id);

    public ArrayList<Animal> getAllAnimals();

    Animal addAnimal(Animal animal);
}
