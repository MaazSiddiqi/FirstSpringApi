package com.example.firstjavaspringapi.service;

import com.example.firstjavaspringapi.model.Animal;

import java.util.ArrayList;

public interface AnimalService {
    public Animal getAnimalbyId(long id);
    public Animal getAnimalbyName(String name);

    public ArrayList<Animal> getAllAnimals();

    public Animal addAnimal(Animal animal);

    public void updateAnimal(Animal animal, long id);

    void deleteAnimal(long id);
}
