public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){
        //task: assign a randomvalue between 10-100
        numberOfPlants = (int) (Math.random()*90+10);
        int plantID = (int)(Math.random()*5);

        if (plantID==0){
            planetName= "tomato";
        }
        else if(plantID=1){
            plantName= "carrot";
        }
        else if(plantID=2){
            plantName= "lettuce";
        }
        else if(plantID=3){
            plantName= "tulip";
        }
        else(plantID=4) {
            plantName= "empty";
        }

        int waterID=(int)(Math.random()*2);

         if(plantID=0){
            needsWater=true;
        }
         else(){
             needsWater=false;
        }
    }

    public void printPlotInfo(){
        system.out.println("*****");
        system.out.println("plant name"+plantName);
        system.out.println("number of Plants"+numberOfPlants);
        system.out.println("needs watre" +needsWater);
    }
}
