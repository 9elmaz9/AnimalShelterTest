package EXAMPLE.service;

import EXAMPLE.model.Animal;
import EXAMPLE.model.SortType;
import EXAMPLE.repository.AnimalRepository;

import java.util.Comparator;
import java.util.List;

public class AnimalService {
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }


    //sort
    public void sortAnimalShelter(SortType sortType){
        List<Animal> animalList = animalRepository.getAnimals();

        switch (sortType) {
            case AGE -> sortAnimalsByAge(animalList);
            case NAME -> sortAnimalsByName(animalList);
        }

        System.out.println();
    }

    public void sortAnimalsByName(List<Animal> animalList){
        animalList.sort(Comparator.comparing(Animal::getName));
    }

    public void sortAnimalsByAge(List<Animal> animalList){
        animalList.sort(Comparator.comparing(Animal::getAge));
    }


    //add
    public void addAnimal(List<String >  animalList){
        animalList.add(1,"Bob");
        if(animalList.isEmpty())
            System.out.println("error");
    }



    //return

    public List<Animal> returnAllAnimals(){
        return animalRepository.getAnimals();


    }



}
