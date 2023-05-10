package com.example.firstjavaspringapi.service;

import com.example.firstjavaspringapi.controller.AnimalController;
import com.example.firstjavaspringapi.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService {


    public Animal getAnimalbyId(long id) {
        return new Animal(id, "Dog", 3);
    }
}
