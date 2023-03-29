package Module;

import javax.xml.catalog.Catalog;

public class CrateStack {
    private int index;
    private int spalte;
    private String[] stack;

    public CrateStack(int spalte){
        this.spalte = spalte;
        this.stack = new String[AoV_05.boxes.length];
    }

    public void setIndex(int index){
        this.index=index;
    }
    public int getIndex(){
        return this.index;
    }

    public int getSpalte(){
        return this.spalte;
    }

    public String[] getStack(){
        return this.stack;
    }

    public void setStack(String[] stack){
        this.stack=stack;
    }

    public void addOne(String crate){
        this.growifneded7000();
        this.getStack()[index+1]=crate;
        this.index++;
    }

    public void addMulti(String[] crates){
        for(String crate: crates){
            this.addOne(crate);
        }
    }

    public String pop(){
        if(this.index>=0){
            String popedElement = this.getStack()[this.index];
            this.getStack()[this.index]="X";
            this.index--;
            return popedElement;
        }
        return null;

    }

    public void growifneded7000(){
        if(this.index+1==this.getStack().length){
            String[] growedStack = new String[this.getStack().length*2];
            int inx = 0; 
            for(String inhat : this.getStack()){
                growedStack[inx++] = inhat;
            }
            this.setStack(growedStack);
        }
    }
}
