import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        Treinador A = new Treinador("Ash Ketchum");
        A.adicionarPokemon(new Pokemon("Pikachu",32, 12));
        A.adicionarPokemon(new Pokemon("Cubone",30, 17));
        A.adicionarPokemon(new Pokemon("Onix",50, 45));
        A.adicionarPokemon(new Pokemon("Gollet",36, 15));

        A.mostrarDados();

        CentroPokemon centro = new CentroPokemon();
        centro.iniciarMenu(A);
        SistemaDeSom sysom = new SistemaDeSom();
        SistemaPC sypc = new SistemaPC();
    }
}