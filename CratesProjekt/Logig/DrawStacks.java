package Logig;
import Module.CrateStack;

public class DrawStacks {
    private static int[] indexSortetList;

    public static void drawStacks(CrateStack[] stacks){
        int großesIndex = getGroßesIndex(stacks);
        int wiederholung = großesIndex;
        for(int i = 0; i<= wiederholung ; i++){
            for(CrateStack crateStack : stacks){
                if(crateStack.getIndex()>= großesIndex){
                    System.out.print(crateStack.getStack()[großesIndex] + " ");
                }else{
                    System.out.print("    ");
                }
            }
            großesIndex--;
            System.out.println();
        }
    } 

    public static int getGroßesIndex(CrateStack[] stacks)
    {
        indexSortetList = new int[stacks.length];
        int counter =0;
        int großesInt = 0;

        for(CrateStack cst : stacks){
            indexSortetList[counter++] = cst.getIndex();
        }

        for(int i : indexSortetList){
            if(i>großesInt){
                großesInt=i;
            }
        }
        return großesInt;
    }
}
