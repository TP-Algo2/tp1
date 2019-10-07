package SAT_Builder;

import java.util.ArrayList;

public class EnsembleClause {

    // ATTRIBUTS

    private ArrayList<Clause> clauses;
    private int nombreClauses;

    // CONSTRUCTEURS

    public EnsembleClause(){
        this.clauses = new ArrayList<>();
        this.nombreClauses = 0;
    }

    public EnsembleClause(ArrayList<Clause> clauses, int nombreClauses){
        this.clauses = clauses;
        this.nombreClauses = nombreClauses;
    }

    // GETTEURS

    public ArrayList<Clause> getClauses(){
        return this.clauses;
    }

    public int getNombreClauses(){
        return this.nombreClauses;
    }

    // SETTEURS

    public void setClauses(ArrayList<Clause> clauses){
        this.clauses = clauses;
    }

    public void setNombreClauses(int nombreClauses){
        this.nombreClauses = nombreClauses;
    }

    // METHODES

    public void addClause (Clause clause){

        this.clauses.add(clause);
        this.nombreClauses++;
    }
}
