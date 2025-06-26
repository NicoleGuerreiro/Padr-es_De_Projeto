import  javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SistemaDeSom {
    private Clip musica;
    private Clip cura;
    private Clip confirmacao;
    private Clip toquePC;

    public SistemaDeSom() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.musica = abrirMusica("C:\\Users\\Aluno 01\\Documents\\Nicole\\Topicos_de_Informática\\CentroPokemon\\src\\15.wav");
        this.cura = abrirMusica("C:\\Users\\Aluno 01\\Documents\\Nicole\\Topicos_de_Informática\\CentroPokemon\\src\\16-Pokemon-Healed.wav");
        this.confirmacao = abrirMusica("C:\\Users\\Aluno 01\\Documents\\Nicole\\Topicos_de_Informática\\CentroPokemon\\src\\SFX_PRESS_AB.wav");
        this.toquePC = abrirMusica("C:\\Users\\Aluno 01\\Documents\\Nicole\\Topicos_de_Informática\\CentroPokemon\\src\\SFX_TURN_ON_PC.wav");
        this.musica.start();
    }

    Clip abrirMusica(String nome) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File(nome);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        return clip;
    }

    void tocarCura() throws InterruptedException {
        musica.stop();
        this.cura.start();
        long tempo = this.cura.getMicrosecondLength();
        java.util.concurrent.TimeUnit.MICROSECONDS.sleep(tempo);
        musica.start();
    }

    void tocarSom(String som) {
        if (som == "confirm")
            this.confirmacao.start();
        if (som == "pc")
            this.toquePC.start();
    }

}