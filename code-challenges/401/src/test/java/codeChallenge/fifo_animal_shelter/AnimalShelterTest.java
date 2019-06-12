package codeChallenge.fifo_animal_shelter;

import codeChallenge.queue_with_stacks.Animal;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testAnimalShelter_emptyClass_CatQueue(){
        AnimalShelter o = new AnimalShelter();
        Object output = null;
        assertEquals(o.getCatQueue().getFirst(), output);
    }
    @Test
    public void testAnimalShelter_emptyClass_DogQueue(){
        AnimalShelter o = new AnimalShelter();
        Object output = null;
        assertEquals(o.getDogQueue().getFirst(), output);
    }
    @Test
    public void testAnimalShelter_singleEnqueue_DogQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oDog = new Animal ("Dog","huskey");
        Object output = "huskey";
        oShelter.enqueue(oDog);
        assertEquals(oShelter.getDogQueue().getFirst().getData().getName(), output);
    }
    @Test
    public void testAnimalShelter_MultiEnqueue_DogQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oDog = new Animal ("Dog","huskey");
        Animal oDog1 = new Animal ("Dog","doggo");
        Animal oDog2 = new Animal ("Dog","furry doggo");
        Object output = "furry doggo";
        oShelter.enqueue(oDog);
        oShelter.enqueue(oDog1);
        oShelter.enqueue(oDog2);
        assertEquals(oShelter.getDogQueue().getLast().getData().getName(), output);
    }
    @Test
    public void testAnimalShelter_MultiEnqueue_CatQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oCat = new Animal ("cat","tom");
        Animal oCat1 = new Animal ("cat","meoow");
        Animal oCat2 = new Animal ("cat","fat cat");
        Object output = "fat cat";
        oShelter.enqueue(oCat);
        oShelter.enqueue(oCat1);
        oShelter.enqueue(oCat2);

        assertEquals(oShelter.getCatQueue().getLast().getData().getName(), output);
    }
    @Test
    public void testAnimalShelter_MultiEnqueue_CatQueue_DogQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oCat = new Animal ("cat","tom");
        Animal oCat1 = new Animal ("cat","meoow");
        Animal oCat2 = new Animal ("cat","fat cat");
        oShelter.enqueue(oCat);
        oShelter.enqueue(oCat1);
        oShelter.enqueue(oCat2);

        Animal oDog = new Animal ("Dog","huskey");
        Animal oDog1 = new Animal ("Dog","doggo");
        Animal oDog2 = new Animal ("Dog","furry doggo");
        Object output = "furry doggo";
        oShelter.enqueue(oDog);
        oShelter.enqueue(oDog1);
        oShelter.enqueue(oDog2);

        assertEquals(oShelter.getDogQueue().getLast().getData().getName(), output);
    }
    @Test
    public void testAnimalShelter_MultiDequeue_CatQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oCat = new Animal ("cat","tom");
        Animal oCatA = new Animal ("cat","tomA");
        Animal oCat1 = new Animal ("cat","meoow");
        Animal oCat2 = new Animal ("cat","fat cat");
        oShelter.enqueue(oCat);
        oShelter.enqueue(oCatA);
        oShelter.enqueue(oCat1);
        oShelter.enqueue(oCat2);
        //this doesn't dequeue cat2 but it dequeues 'tom' as it is the first item in queue
        oShelter.dequeue(oCat2);
        Object output   = "tomA";

        assertEquals(oShelter.getCatQueue().peek().getName(), output);
    }
    @Test
    public void testAnimalShelter_MultiDequeue_DogQueue(){
        AnimalShelter oShelter = new AnimalShelter();

        Animal oCat = new Animal ("dog","tom");
        Animal oCatA = new Animal ("dog","tomA");
        Animal oCat1 = new Animal ("dog","meoow");
        Animal oCat2 = new Animal ("dog","fat cat");
        oShelter.enqueue(oCat);
        oShelter.enqueue(oCatA);
        oShelter.enqueue(oCat1);
        oShelter.enqueue(oCat2);
        //this doesn't dequeue cat2 but it dequeues 'tom' as it is the first item in queue
        oShelter.dequeue(oCat2);
        Object output   = "tomA";

        assertEquals(oShelter.getDogQueue().peek().getName(), output);
    }
    @Test
            (expected = InvalidParameterException.class)
    public void testAnimalShelter_MultiDequeue_exceptDogCatType() {
        AnimalShelter oShelter = new AnimalShelter();
        Animal oTiger = new Animal("tiger", "fat cat");
        oShelter.dequeue(oTiger);
    }
    @Test
            (expected = NullPointerException.class)
    public void testAnimalShelter_MultiDequeue_null() {
        AnimalShelter oShelter = new AnimalShelter();
        Animal oTiger = null;
        oShelter.dequeue(null);
    }
}