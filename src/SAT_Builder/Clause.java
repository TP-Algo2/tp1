package SAT_Builder;

public class Clause { // AVEC "OU" IMPLICITE

    // ATTRIBUTS

    private Litteral litteral1;
    private Litteral litteral2;

    // CONSTRUCTEURS

    public Clause(){
        this.litteral1 = new Litteral();
        this.litteral2 = new Litteral();
    }

    public Clause(Litteral litteral1, Litteral litteral2){
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
