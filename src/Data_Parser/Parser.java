package Data_Parser;
import SAT_Builder.Clause;
import SAT_Builder.EnsembleClause;
import SAT_Builder.Litteral;

import java.io.*;

public class Parser {

    // ATTRIBUTS
    private EnsembleClause ensembleClause;

    //CONSTRUCTEUR

    public Parser(){
        this.ensembleClause = new EnsembleClause();
    }


    public EnsembleClause parsing() {
        try {
            FileInputStream fstream = new FileInputStream("src/formule-2-sat.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            Litteral litteral1;
            Litteral litteral2;
            String ligne;
            int n = -2;

            while ((ligne = br.readLine()) != null) {
                //ligne = br.readLine();

                if(n>=0) {
                    int lit1 = Integer.parseInt(ligne.split(" ")[0]);
                    int lit2 = Integer.parseInt(ligne.split(" ")[1]);

                    if (lit1 > 0)
                        litteral1 = new Litteral(lit1, true);
                    else
                        litteral1 = new Litteral(-lit1, false);

                    if (lit2 > 0)
                        litteral2 = new Litteral(lit2, true);
                    else
                        litteral2 = new Litteral(-lit2, false);

                    this.ensembleClause.addClause(new Clause(litteral1, litteral2));
                }
                n++;
            }
            br.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return this.ensembleClause;
    }
}


