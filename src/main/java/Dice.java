import java.util.Random;

public class Dice {

    int numOfDice;
    int numOfSides;


    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
        this.numOfSides = 6;
    }

    public Dice(int numOfDice, int numOfSides) {
        this.numOfDice = numOfDice;
        this.numOfSides = numOfSides;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(2,6);
        Dice dice1 = new Dice(2);
        System.out.println(dice1.tossAndSum());
        System.out.println(dice.tossAndSum());
    }

    public int getRoll() {
        Random random = new Random();
        return (random.nextInt(this.numOfSides)+1);
    }

    public int tossAndSum() {
        int sum = 0;
        for(int i=0; i<this.numOfDice; i++) {
            sum += getRoll();
        }
        return sum;
    }
}
