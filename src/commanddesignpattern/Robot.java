package commanddesignpattern;

public class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void pickup() {
        System.out.println("Oh treasure, picking it up!");
    }

    public void jump() {
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }

    public void fire() {
        System.out.println("Bad guys! Fire my blow torch at them.");
    }

    public void heal() {
        System.out.println("Thanks for healing my wounds.");
    }

}
