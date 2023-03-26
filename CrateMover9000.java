import java.io.IOException;

import Logig.CrateStacksLogig;
import Logig.MovesCreater;
import Logig.StacksCreater;
import Logig.DrawStacks;
import Module.Move;

public class CrateMover9000{
    
    public static void main(String[] args) throws InterruptedException, IOException {
        
        StacksCreater stacksCreater = new StacksCreater();
        stacksCreater.stacksErsteller();

        MovesCreater movesCreater = new MovesCreater();
        movesCreater.creatMovesArray();

        int counter = 1;
        for(Move m : movesCreater.movesArray){
            System. out. print("\033[H\033[2J");
            System. out. flush();
            CrateStacksLogig.moveCrate(m);
            System.out.println("\033[0;33m Move: " + counter++ + "( "+ m +" ) \n ");
        }
        DrawStacks.drawStacks(stacksCreater.stacks);
        System.out.println();
        DrawStacks.printResult(stacksCreater.stacks);
    }

}