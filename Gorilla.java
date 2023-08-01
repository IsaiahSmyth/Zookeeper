public class Gorilla extends Mammal{
    public void throwSomething(){
        energy -=5;
        System.out.println("The gorilla has thrown something!");
    }

    public void eatBanana(){
        energy += 10;
        System.out.println("The gorilla is satisfied with bananas!");
    }

    public void climb(){
        energy -= 10;
        System.out.println("The gorilla has climbed a tree!");
    }
}
