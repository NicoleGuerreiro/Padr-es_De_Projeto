import java.util.ArrayList;

public class SistemaPC {
        ArrayList<Pokemon> box;

        SistemaPC(){
            box = new ArrayList<Pokemon>();
        }

        void adicionarPokemon(Pokemon P){
            box.add(P);
        }

        void mostrarBox(){
            System.out.println("\n===============" +
                    "\nPokemons no PC:\n");
            for(Pokemon P:box){
                System.out.println(P);
            }
            System.out.println("\n===============");
        }
}
