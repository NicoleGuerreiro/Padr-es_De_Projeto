import java.util.ArrayList;

public class Treinador {
    String nome;
    ArrayList<Pokemon> equipe;


    Treinador(String nome) {
        this.nome = nome;
        this.equipe = new ArrayList<Pokemon>();
    }

    void adicionarPokemon(Pokemon p) {
        this.equipe.add(p);
    }

    public ArrayList<Pokemon> getEquipe() {
        return equipe;
    }
    void mostrarDados() {
        System.out.println("Treinador(a): "+this.nome+"\nPokémons: ");
        for(Pokemon p: this.equipe) {
            System.out.println(p);
        }
    }
}