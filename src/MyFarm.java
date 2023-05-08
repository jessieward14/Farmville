import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;


    public static void main(String[] args) {
        //  System.out.println("this is my farm");

        MyFarm LettuceCode = new MyFarm();
    }

    public MyFarm() {
        row = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }

        //totalPlants();
        //totalCarrots();
        printRowInfo();
        //addLettuce();
        //addTulip();
        //tomatoLocations();
        //averageNumberOfPlants();
        //numberOfCarrotPlots();
        //numberOfEmptyPlots();
        //everyOtherNeedsWater();
        plantWithMaxNumber();

        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
    }

    public void totalPlants() {
        int total = 0;
        System.out.println("*****TOTAL PLANTS*****");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;
        }
        System.out.println("total plants in a row:" + total);
    }


    ///practice problems


    public void printPlantNames() {

        // print the name of each plant in the row and its index
        System.out.println("****PLANT NAMES*****");
        for (int i = 0; i < row.size(); i++) {
            System.out.print(i + ":" + row.get(i).plantName + ", ");
        }
        System.out.println();
    }


    public void printRowInfo() {
        System.out.println("***PRINT ROW INFO*****");

        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row

    }


    public void addLettuce() {

        // add a lettuce plot to the end of the row with 42 plants that need water

        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("***ADD LETTUCE***");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantNames();
    }


    public void addTulip() {

        // at index 3, add a new tulip plot with 70 plants that do not need water

        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("***ADD TULIP***");
        printPlantNames();
        row.add(new Plot());
        row.get(3).plantName = "lettuce";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantNames();

    }


    public void tomatoLocations() {

        // print indexes of all tomato plants

        // call printPlantNames() method to make sure you're getting the correct indexes
        System.out.println("****TOMATO LOCATIONS****");
        printPlantNames();
        numberOfEmptyPlots();
        if (row.isEmpty()) {
            printPlantNames();
        }


    }


    public void totalCarrots() {

        // how many total carrot plants are there?
        int total = 0;
        System.out.println("*****TOTAL PLANTS*****");
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                total = total + row.get(k).numberOfPlants;
            }
        }
        System.out.println("total plants in a row:" + total);

    }


    public void averageNumberOfPlants() {

        // what is the average number of plants across the whole row?
        System.out.println("***AVERAGE # OF PLANTS****");
        int total = 0;
        int avg;
        for (int index = 0; index < row.size(); index++) {
            total = total + row.get(index).numberOfPlants;
        }
        avg = total / 10; //or divide by row.size()
        System.out.println("This is the average number of plants per plot:" + avg);

    }

    public void numberOfCarrotPlots() {

        // how many plots have carrots on them

// call printPlantNames() method to check
        System.out.println("****CARROT PLOTS**");
        int total = 0;
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                total = total + 1;
            }
        }
        System.out.println("Total Carrot Plots:" + total);


    }


    public void numberOfEmptyPlots() {
        System.out.println("****TOTAL EMPTY****");
        int total = 0;
        for (int s = 0; s < row.size(); s++) {
            if (row.get(s).plantName == "empty") {
                total++;
            }
        }
        System.out.println("number of empty plants" + total);

        // how many plots are empty

// call printPlantNames() method to check

    }

    public void everyOtherNeedsWater() {

        // change the value of needsWater to be true for every other plot
        System.out.println("every other plant needs water");
        for (int k = 0; k < row.size(); k = k + 2) {
            row.get(k).needsWater = true;
        }
        System.out.println();

    }


    public void greaterThan10() {


        // how many plots have more than 10 plants in the plot?
        System.out.println("HAS MORE THAN 10 PLANTS***");



    }


   /* public void plantWithMaxNumber() {

        // which plant type has the most total plants?
        System.out.println("PLANT W MAX NUMBER");
        int total = 0;
        int tomato = 0;
        int lettuce = 0;
        int tulip = 0;
        int carrot;
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                total = row.get(k).numberOfPlants + total;
            }
            if (row.get(k).plantName.equals("tulip")) {
                total = row.get(k).numberOfPlants + total;
            }
            if (row.get(k).plantName.equals("lettuce")) {
                total = row.get(k).numberOfPlants + total;
            }
            if (row.get(k).plantName.equals("tomato")) {
                total = row.get(k).numberOfPlants + total;
            }
        }

    }
*/
    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        System.out.println("******Plant With Minimum Number*********");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalTulips=0;
        int totalLettuce=0;

        //step 1: add up the total Carrots, total Tomatoes, total tulips, total Lettuce
        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName.equals("carrot")){
                totalCarrots=totalCarrots+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tomato")){
                totalTomatoes=totalTomatoes+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tulip")){
                totalTulips=totalTulips+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("lettuce")){
                totalLettuce=totalLettuce+row.get(k).numberOfPlants;
            }
        }
        //step 2: compare each individual plant total to find the smallest (greater than 0)
        int currentMin=0;
        String plantType="empty";

        if(totalCarrots<totalTomatoes ){
            currentMin=totalCarrots;
            plantType="carrot";
        }else {
            currentMin=totalTomatoes;
            plantType="tomato";
        }
        //current min vs. tulip
        if (totalTulips<currentMin && totalTulips>0){
            currentMin=totalTulips;
            plantType="tulip";
        }
        //current min vs. lettuce
        if(totalLettuce<currentMin && totalLettuce>0){
            currentMin=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("The min plant type is "+plantType+ " with "+ currentMin+ " plants.");

    }





    public void plantWithMaxNumber(){

        // which plant type has the most t

        // which plant type has the most total plants (not counting empty plots) that needs water?
        System.out.println("****PLANT WITH MAX NUMBER*****");
        int totalCarrots=0;
        int totalTomatoes=0;
        int totalTulips=0;
        int totalLettuce=0;

        //step 1: add up the total Carrots, total Tomatoes, total tulips, total Lettuce
        for(int k=0;k<row.size();k++){
            if(row.get(k).plantName.equals("carrot")){
                totalCarrots=totalCarrots+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tomato")){
                totalTomatoes=totalTomatoes+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("tulip")){
                totalTulips=totalTulips+row.get(k).numberOfPlants;
            }
            if(row.get(k).plantName.equals("lettuce")){
                totalLettuce=totalLettuce+row.get(k).numberOfPlants;
            }
        }
        //step 2: compare each individual plant total to find the smallest (greater than 0)
        int currentMax=row.get(0).numberOfPlants;
        String plantType= row.get(0).plantName;

        if(totalCarrots>totalTomatoes &&totalCarrots>totalTulips && totalCarrots>totalTomatoes) {
            currentMax = totalCarrots;
            plantType = "carrot";
        }
        if(totalTomatoes>totalLettuce &&totalTomatoes>totalTulips && totalTomatoes>totalCarrots) {
            currentMax = totalTomatoes;
            plantType = "tomato";
        }

        //current min vs. tulip
        if(totalTulips>totalTomatoes &&totalTulips>totalCarrots && totalTulips>totalTomatoes){
            currentMax=totalTulips;
            plantType="tulip";}
        //current min vs. lettuce
        if(totalLettuce>totalTomatoes &&totalLettuce>totalTulips && totalLettuce>totalCarrots){
            currentMax=totalLettuce;
            plantType="lettuce";
        }
        System.out.println("The max plant type is "+plantType+ " with "+ currentMax+ " plants.");

    }


}

        // how many total plants are there in the row?






