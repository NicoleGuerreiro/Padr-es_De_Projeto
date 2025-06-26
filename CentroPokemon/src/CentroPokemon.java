import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public class CentroPokemon {
    SistemaDeCura cura;
    SistemaPC pc;
    SistemaDeSom som;

    CentroPokemon() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        this.cura = new SistemaDeCura();
        this.pc = new SistemaPC();
        this.som = new SistemaDeSom();
    }

    void iniciarMenu(Treinador T) throws InterruptedException {


        Scanner entrada = new Scanner(System.in);

        int op = 0;
        while (op != -1) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("\n" +
                    "1-Mostrar Equipe\n" +
                    "2-Curar Equipe\n" +
                    "3-Abrir PC\n" +
                    "4-Sair");
            op = entrada.nextInt();
            op = selecionar(op, T);
        }
    }
    int selecionar(int op, Treinador T) throws InterruptedException {
        switch (op){
            case 1:
                T.mostrarDados();
                break;
            case 2:
                curarEquipe(T);
                break;
            case 3:
                abrirPC();
                break;
            case 4:
                return -1;
            default:
                System.out.println("Opção Inválida!");
        }
        return 0;
    }

    void curarEquipe(Treinador T) throws InterruptedException {
        this.cura.curarEquipe(T);
        this.som.tocarCura();
    }


    void abrirPC(){
        this.som.tocarSom("PC");
        this.pc.mostrarBox();
    }


}