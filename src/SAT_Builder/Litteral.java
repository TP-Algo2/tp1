package SAT_Builder;

public class Litteral {

    // ATTRIBUTS

    private int litteral;
    private boolean value;

    // CONSTRUCTEURS

    public Litteral (){
        this.litteral = 0;
        this.value = true;
    }

    public Litteral (int litteral, boolean value){
        this.litteral = litteral;
        this.value = value;
    }

    // GETTEURS

    public int getLitteral (){
        return this.litteral;
    }

    public boolean getValue (){
        return this.value;
    }

    // SETTEURS

    public void setLitteral (int litteral){
        this.litteral = litteral;
    }

    public void setValue (boolean value){
        this.value = value;
    }

    // METHODES

    public void negation(){
        if(this.value)
            this.value = false;
        else
            this.value = true;
    }

}
