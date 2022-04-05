package classes;

import java.io.IOException;

public class HIlo3 extends Thread{
    public Pokedex pokedex;
    public Pokemon pokemon;
    public Pokemon getPokemon() throws IOException, InterruptedException {
        return pokemon = this.pokedex.buscarPokemon();
    }
    public void run(){

    }
}
