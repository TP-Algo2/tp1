package Tests;
import Data_Parser.Parser;
import SAT_Builder.EnsembleClause;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ParserTest {

        @Test
        public void test() {
            EnsembleClause e = new Parser().parsing();
            assertThat(e.getNombreClauses(), equalTo(4));

            assertThat(e.getClauses().get(0).getLitteral1().getLitteral(), equalTo(1));
            assertThat(e.getClauses().get(0).getLitteral1().getValue(), equalTo(true));
            assertThat(e.getClauses().get(0).getLitteral2().getLitteral(), equalTo(2));
            assertThat(e.getClauses().get(0).getLitteral2().getValue(), equalTo(false));

            assertThat(e.getClauses().get(1).getLitteral1().getLitteral(), equalTo(1));
            assertThat(e.getClauses().get(1).getLitteral1().getValue(), equalTo(false));
            assertThat(e.getClauses().get(1).getLitteral2().getLitteral(), equalTo(3));
            assertThat(e.getClauses().get(1).getLitteral2().getValue(), equalTo(true));

            assertThat(e.getClauses().get(2).getLitteral1().getLitteral(), equalTo(1));
            assertThat(e.getClauses().get(2).getLitteral1().getValue(), equalTo(true));
            assertThat(e.getClauses().get(2).getLitteral2().getLitteral(), equalTo(3));
            assertThat(e.getClauses().get(2).getLitteral2().getValue(), equalTo(true));

            assertThat(e.getClauses().get(3).getLitteral1().getLitteral(), equalTo(2));
            assertThat(e.getClauses().get(3).getLitteral1().getValue(), equalTo(false));
            assertThat(e.getClauses().get(3).getLitteral2().getLitteral(), equalTo(3));
            assertThat(e.getClauses().get(3).getLitteral2().getValue(), equalTo(false));
        }
}
