package Module;
public class Move {
    private int anzhal, oldStack, newStacks;

    public Move(int anzhal, int oldStack, int newStacks){
        this.anzhal=anzhal;
        this.oldStack=oldStack;
        this.newStacks=newStacks;
    }

    public void setAnzahl(int anzhal){
        this.anzhal=anzhal;
    }
    public int getAnzahl(){
        return this.anzhal;
    }

    public void setOldStack(int oldStack){
        this.oldStack=oldStack;
    }
    public int getOldStack(){
        return this.oldStack;
    }

    public void setNewStacks(int newStacks){
        this.newStacks=newStacks;
    }
    public int getNewStacks(){
        return this.newStacks;
    }

    @Override
    public String toString() {
         return this.anzhal + " " + this.oldStack + " " + this.newStacks;
     }
}
