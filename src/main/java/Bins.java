
import java.util.HashMap;


public class Bins {
    // bin with lower and upper limit
    // map: key is result of possible toss number, value is number of times the key appears when tossed
    // for loop iterate through and add keys (possible sums from number of dice tossed)
    // per dice toss, increment respective bin by 1
    // if you need to select a bin, retrieve bin by key and get value

    HashMap<Integer, Integer> Bin;
    Dice dice;


    public Bins(int low, int high) {
        Bin = new HashMap<>();
        for(int i=low; i<=high; i++) {
            Bin.put(i,0);
        }
    }

    public void incrementBin(Integer binName) {
        if(Bin.containsKey(binName)) {
            Bin.put(binName, (Bin.get(binName)+1));
        }

    }

    public Integer getBin(int binName) {
        return Bin.get(binName); //retrieves value of key/binName
    }

//    public static void main (String[]args) {
//        Bins bin = new Bins(2,12);
//        bin.incrementBin(2);
//        System.out.println(bin.getBin(2));
//    }

}
