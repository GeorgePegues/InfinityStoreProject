package commanddesignpattern;

/**
 * Class for Robot; contains four commands
 * @author William Zhang
 */
public class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    /**
     * Robot picks up treasure
     */
    public void pickup() {
        System.out.println("Oh treasure, picking it up!");
    }

    /**
     * Robot jumps
     */
    public void jump() {
        System.out.println("Oh no a hazard, I'm jumping over it.");
    }

    /**
     * Robot sprays fire
     */
    public void fire() {
        System.out.println("Bad guys! Fire my blow torch at them.");
    }

    /**
     * Robot heals
     */
    public void heal() {
        System.out.println("Thanks for healing my wounds.");
    }

}
