package java;

import java.util.HashMap;
import java.util.Map;


public class land {
    private String level;
    private boolean hasTreasure;
    private int north, south, east, west;
    private HashMap<String, Integer> navigation;




    public land (String level, boolean hasTreasure, int n, int s, int e, int w) {
            this.level = level;
            this.hasTreasure = hasTreasure;
            this.north= n;
            this.south = s;
            this.east= e;
            this.west = w;

            navigation = new HashMap<>();
    }

    public land(){
        this.level = "";
        this.hasTreasure = false;
    }




    public String toString(){
//        return "name: " + name
//                + "\n treasure" + ;

    }
}
