package Graph_Builder;

import SAT_Builder.Clause;
import SAT_Builder.Litteral;

public class Implication { // implication implicite

    // ATTRIBUTS
    private Litteral litteral1;
    private Litteral litteral2;

    // CONSTRUCTEURS

    public Implication(){
        this.litteral1 = new Litteral();
        this.litteral2 = new Litteral();
    }

    public Implication(Litteral litteral1, Litteral litteral2){
        this.litteral1 = litteral1;
        this.litteral2 = litteral2;
    }

    // GETTEURS

    public Litteral getLitteral1(){
        return this.litteral1;
    }

    public Litteral getLitteral2(){
        return this.litteral2;
    }

    // SETTEURS

    public void setLitteral1(Litteral litteral1){
        this.litteral1 = litteral1;
    }

    public void setLitteral2(Litteral litteral2){
        this.litteral2 = litteral2;
    }
}
