package Logig;
import Module.AoV_05;
import Module.CrateStack;

public class StacksCreater {
    public static CrateStack[] stacks = new CrateStack[AoV_05.boxes[1].split(",").length ];

    public void stacksErsteller(){
        for(int i = 0; i<AoV_05.boxes[1].split(",").length ; i++){
            stacks[i] = new CrateStack(i+1);
        }

        int inxStackZeile = AoV_05.boxes.length -1;
        int inxZeile = 0;

        for( String zeile : AoV_05.boxes){
            for(String spalteInhalt : zeile.split(",")){
                stacks[inxZeile].getStack()[inxStackZeile] = spalteInhalt;
                inxZeile++;
            }
            inxZeile=0;
            inxStackZeile--;
        }

        for(CrateStack inhalt: stacks){
            for(int i =inhalt.getStack().length -1 ; i>=0; i--){
                if(!inhalt.getStack()[i].equals("X")){
                    inhalt.setIndex(i);
                    break;
                }
            }
        }
    }
}
