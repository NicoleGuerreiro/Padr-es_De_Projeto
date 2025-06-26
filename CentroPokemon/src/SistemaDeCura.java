import java.util.ArrayList;

public class SistemaDeCura {
    public void curarEquipe(Treinador T){
        ArrayList<Pokemon> equipe = T.getEquipe();

        for (Pokemon P: equipe) {
            P.curar100pc();
        }

    }
}
