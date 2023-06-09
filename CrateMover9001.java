import java.io.IOException;
import Logig.CrateStacksLogig;
import Logig.MovesCreater;
import Logig.StacksCreater;
import Logig.DrawStacks;
import Module.Move;

public class CrateMover9001 {
    public static void main(String[] args) throws InterruptedException, IOException{
        StacksCreater stacksCreater = new StacksCreater();
        CrateStacksLogig crateStacksLogig = new CrateStacksLogig();
        DrawStacks drawS = new DrawStacks();
        MovesCreater movesCreater = new MovesCreater();
        stacksCreater.stacksErsteller();
        movesCreater.creatMovesArray();
        int counter = 1;
        for(Move m : movesCreater.movesArray){
            // für amation wird nach jeder Move console clearen !! 
            // System.out.print("\033[H\033[2J");
            // System.out.flush();
            System.out.println(" \n \n \n");
            crateStacksLogig.moveCrate9001(m , stacksCreater);
            System.out.println("\033[0;33m Move: " + counter++ + "( "+ m +" ) \n ");
            drawS.drawStacks(stacksCreater.stacks);
            Thread.sleep(200);
            System.out.println();
        }
        System.out.println();
        drawS.printResult(stacksCreater.stacks);

    }
    
    
}
