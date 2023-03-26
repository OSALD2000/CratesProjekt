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
                    System.out.print("\033[0;37m"+crateStack.getStack()[großesIndex] + " ");
                }else{
                    System.out.print("    ");
                }
            }
            großesIndex--;
            System.out.println();
        }
    } 

    private static int getGroßesIndex(CrateStack[] stacks)
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

    public static void printResult(CrateStack[] stacks){
        String firstResult ="";
        String endResult="";
        for(CrateStack cst : stacks){
            firstResult= firstResult+""+cst.getStack()[cst.getIndex()];
        }
        for(char res : firstResult.toCharArray()){
            if(!(res+"").equals("[")){
                if(!(res+"").equals("]")){
                    endResult=endResult+res;
                }
            }
        }
        endResult = endResult+"";
        System.out.println("\033[0;31m"+endResult);
    }
}
