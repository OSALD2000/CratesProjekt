package Logig;
import Module.Move;

public class CrateStacksLogig {
    public static void moveCrate(Move m , StacksCreater stacksCreater){
        for(int i =0 ; i<m.getAnzahl(); i++){
            stacksCreater.stacks[m.getNewStacks()-1].add(stacksCreater.stacks[m.getOldStack()-1].pop());
        } 
    }    
}
