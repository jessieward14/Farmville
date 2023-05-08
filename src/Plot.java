public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){
        //task: assign a randomvalue between 10-100
        numberOfPlants = (int) (Math.random()*90+10);
        int plantID = (int)(Math.random()*5);

        if (plantID==0){
            plantName= "tomato";
        }
        else if(plantID==1){
            plantName= "carrot";
        }
        else if(plantID==2){
            plantName= "lettuce";
        }
        else if(plantID==3){
            plantName= "tulip";
        }
        else{
            plantName= "empty";
            numberOfPlants=0;
        }



        int waterID=(int)(Math.random()*2);

        if(plantID==0){
            needsWater=true;
        }
        else{
            needsWater=false;
        }
    }

    public void printPlotInfo(){
        System.out.println("*****");
        System.out.println("plant name "+plantName);
        System.out.println("number of Plants "+numberOfPlants);
        System.out.println("needs water"  +needsWater);
    }
}
