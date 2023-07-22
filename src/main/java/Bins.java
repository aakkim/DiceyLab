import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bins {
    // bin with lower and upper limit
    // map: key is result of possible toss number, value is number of times the key appears when tossed
    // for loop iterate through and add keys (possible sums from number of dice tossed)
    // per dice toss, increment respective bin by 1
    // if need to select a bin, retrieve bin by key and get value

    HashMap<Integer, Integer> Bin;



    public Bins(int low, int high) {
        Bin = new HashMap<>();
        for(int i=low; i<=high; i++) {
            Bin.put(i,0);
        }
    }

    public Integer getBin(int binName) {
        return Bin.get(binName); //retrieves value of key/binName
    }

    public void incrementBin(int binName) {
        int value = Bin.get(binName); // retrieve value
        Bin.put(binName, value+1); // then add 1 to value
    }

}
