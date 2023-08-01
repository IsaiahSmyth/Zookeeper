public class Bat extends Mammal{
    public Bat() {
        this.energy = 300;
    }

    public void fly(){
        energy -= 50;
        System.out.println("The bat takes flight!");
    }

    public void eatHumans(){
        energy += 25;
        System.out.println("The bat eats a human");
    }

    public void attackTown(){
        energy -= 100;
        System.out.println("The bat attacks a town");
    }
}
