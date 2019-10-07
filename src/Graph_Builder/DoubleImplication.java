package Graph_Builder;

public class DoubleImplication { // ET implicite

    // ATTRIBUTS

    private Implication implication1;
    private Implication implication2;

    // CONSTRUCTEURS

    public DoubleImplication(){
        this.implication1 = new Implication();
        this.implication2 = new Implication();
    }

    public DoubleImplication(Implication implication1, Implication implication2){
        this.implication1 = implication1;
        this.implication2 = implication2;
    }

    // GETTEURS

    public Implication getImplication1(){
        return this.implication1;
    }

    public Implication getImplication2(){
        return this.implication2;
    }

    // SETTEURS

    public void setImplication1(Implication implication1){
        this.implication1 = implication1;
    }

    public void setImplication2(Implication implication2){
        this.implication2 = implication2;
    }
}
