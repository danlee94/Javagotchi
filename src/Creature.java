/**
 * Created by k1764092 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat(){
        if (fullness >= 12){
            System.out.println("Woops, " + this.getName() + " is already full.");
        } else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if (fullness > 15) {fullness = 15; }

            System.out.println("That was very delicious!");
        }
    }

    public void sleep(){
        if (energy  >= 12){
            System.out.println("Woops, " + this.getName() + " is not tired.");
        } else {
            fullness -= 5;
            happiness -= 5;
            energy += 8;

            System.out.println (" That was a good nap!");
            if (energy > 15) {
                energy = 15;
            }
        }
    }

    public void play() {

            fullness -= 4;
            happiness += 8;
            energy -= 6;

            if (happiness > 15) {
                happiness = 15;
            }

        System.out.println ("That was fun, let's do it again!");
    }

    public String checkStatus(){
        String status = "";

        if (happiness <= 6) {
            status += "Oh, " + this.getName() +" is feeling sad!\n";
        }

        if (energy <=6) {
            status += "Hmm, " + this.getName() + " is really tired!\n";
        }

        if (fullness <= 6) {
            status += "Woops, " + this.getName() + " is super hungry!\n";
        }

        if (happiness <= 0 || energy <= 0 || fullness <=0 ){
            System.out.println ("Oh no, " + this.getName() + "just died");
            System.exit (0);
        }

        return status;
    }

    public String getName(){
        return name;
    }



}
