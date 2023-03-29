package Logig;
import Module.Move;

public class CrateStacksLogig{
    public void moveCrate7000(Move m , StacksCreater stacksCreater){
        for(int i =0 ; i<m.getAnzahl(); i++){
            stacksCreater.stacks[m.getNewStacks()-1].addOne(stacksCreater.stacks[m.getOldStack()-1].pop());
        } 
    }    

    public void moveCrate7001(Move m , StacksCreater stacksCreater){
        String[] crates = new String[m.getAnzahl()];
        for(int i =1 ; i<m.getAnzahl()+1; i++){       
            crates[m.getAnzahl()-i]=stacksCreater.stacks[m.getOldStack()-1].pop();
        }
        stacksCreater.stacks[m.getNewStacks()-1].addMulti(crates);
    }    
}
