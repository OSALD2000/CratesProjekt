package Logig;
import Module.AoV_05;
import Module.Move;

public class MovesCreater {
    public  Move[] movesArray;

    public MovesCreater(){
        this.movesArray = new Move[AoV_05.moves.length];
    }

    public void creatMovesArray(){
        int counter = 0;
        int index=0;
        int anzahl =0 , oldStack= 0, newStack = 0;
        for(String fullMove : AoV_05.moves){
            for(String inhalt : fullMove.split(" ")){
                try{
                    if(counter==0){
                        anzahl=Integer.parseInt(inhalt);
                    } else if (counter==1){
                        oldStack=Integer.parseInt(inhalt);
                    } else{
                        newStack=Integer.parseInt(inhalt);       
                    }
                    counter++;
                }catch(Exception e){}
            }
            if( anzahl !=0 && oldStack != 0 && newStack !=0){
                this.movesArray[index++] = new Move(anzahl, oldStack, newStack);
            }else{
                System.out.println("Move hat eine 0 Error!");
                break;
            }
            anzahl =0; oldStack= 0; newStack = 0;
            counter=0;
        }
    }
    
}
