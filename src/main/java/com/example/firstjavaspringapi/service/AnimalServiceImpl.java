package com.example.firstjavaspringapi.service;

import com.example.firstjavaspringapi.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

@Service
public class AnimalServiceImpl implements AnimalService {

    ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Animal(1, "Dog", 3), new Animal(2, "Cat", 2)));

    @Override
    public Animal getAnimalbyId(long id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return animal;
            }
        }

        return null;
    }

    @Override
    public Animal getAnimalbyName(String name) {
        for (Animal animal : animals) {
            if (Objects.equals(animal.getName(), name)) {
                return animal;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Animal> getAllAnimals() {
        return animals;
    }

    @Override
    public Animal addAnimal(Animal animal) {
        animals.add(animal);
        return animal;
    }

    @Override
    public void updateAnimal(Animal animal, long id) {
        for (Animal animal1 : animals) {
            if (animal1.getId() == id) {
                animal1.setName(animal.getName());
                animal1.setAge(animal.getAge());
            }
        }
    }

    @Override
    public void deleteAnimal(long id) {
        animals.removeIf(animal -> animal.getId() == id);
    }
}
