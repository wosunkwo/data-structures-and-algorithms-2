package codeChallenge.fifo_animal_shelter;

import codeChallenge.queue_with_stacks.Animal;
import stacksandqueues.Queue;

import java.security.InvalidParameterException;

public class AnimalShelter {
   private Queue<Animal> queueCat;
   private Queue<Animal> queueDog;

   AnimalShelter(){
       this.queueCat = new Queue<Animal>();
       this.queueDog = new Queue<Animal>();
   }
    public void enqueue(Animal animal){
        if(animal.equals(null)){
            throw new NullPointerException("Can't enqueue null ");
        }
        else if(animal.getType().toUpperCase().equals("DOG")){
            queueDog.enqueue(animal);
        }
        else if(animal.getType().toUpperCase().equals("CAT")){
            queueCat.enqueue(animal);
        }
    }

    public void dequeue(Animal animal){
        if(animal.equals(null)){
            throw new NullPointerException("Can't enqueue null ");
        }
        else if(animal.getType().toUpperCase().equals("DOG")){
             queueDog.dequeue();
        }
        else if(animal.getType().toUpperCase().equals("CAT")){
            queueCat.dequeue();
        }
        else{
            throw new InvalidParameterException("Can only de/enqueue Cat/Dog type");
        }
    }

    public Queue<Animal> getCatQueue(){
       return this.queueCat;
    }
    public Queue<Animal> getDogQueue(){
        return this.queueDog;
    }


}

