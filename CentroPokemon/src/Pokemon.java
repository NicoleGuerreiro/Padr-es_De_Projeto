public class Pokemon {
    String especie;
    int vida_max;
    int vida;

    Pokemon(String nome, int vida_max, int vida) {
        this.especie = nome;
        this.vida_max = vida_max;
        this.vida = vida;
    }

    void curar100pc(){
        this.vida = this.vida_max;
    }

    public String toString() {
        return "\n---------------\n"+
                this.especie+
                "\nVida: "+this.vida+"/"+this.vida_max;
    }
}
