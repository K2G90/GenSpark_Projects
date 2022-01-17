package java;

import java.util.HashMap;
import java.util.Map;


    public class land {
        private String level;
        private boolean hasTreasure;
        private boolean poison;
        private boolean addHealth;
        private int north = 0, south = 0, east = 0, west = 0;
        private HashMap<String, Integer> navigation;


    public land() {
        this.level="Uninhabited";
        this.addHealth=false;
        this.poison=false;
    }


    public land (String level, boolean hasTreasure, int n, int s, int e, int w) {
            this.level = level;
            this.hasTreasure = hasTreasure;
            this.north= n;
            this.south = s;
            this.east= e;
            this.west = w;

            navigation = new HashMap<>();
    }

        //Getters and Setters
        public String getLevel(){ return level;}
        public void setLevel(String currKingdom) { this.level = currKingdom; }

        public boolean getPoison() { return poison; }
        public void setPoison(boolean currPoison) { this.poison = currPoison; }

        public boolean getAddHealth() { return addHealth; }
        public void setAddHealth(boolean currAddHealth) { this.addHealth = currAddHealth; }

        public int getNorth() { return north; }
        public void setNorth(int currNorth) { this.north = currNorth;}

        public int getSouth() { return south; }
        public void setSouth(int currSouth) { this.south = currSouth;}

        public int getEast() { return east; }
        public void setEast(int currEast) { this.east = currEast;}

        public int getWest() { return west; }
        public void setWest(int currWest) { this.west = currWest;}

        public HashMap<String, Integer> getNavigation() {return navigation;}
        public void setNavigation(HashMap<String, Integer> currGameMap) {this.navigation = currGameMap;}


        @Override
        public String toString() {
            return "Land {" +
                    "\n This is: " + level + ", " +
                    "\n Poison?: " + poison + ", " +
                    "\n Health added?: " + addHealth + "," +
                    "\n coordinates: " + navigation +
                    "\n }";
        }
}
