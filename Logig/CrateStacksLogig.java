package Logig;
import Module.Move;

public class CrateStacksLogig {
    public static void moveCrate(Move m){
        for(int i =0 ; i<m.getAnzahl(); i++){
            StacksCreater.stacks[m.getNewStacks()-1].add(StacksCreater.stacks[m.getOldStack()-1].pop());
        } 
    }    
}
