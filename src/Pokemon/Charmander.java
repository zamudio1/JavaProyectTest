package Pokemon;

import JuegoPokemon.PokemonFuego;

public class Charmander extends PokemonFuego{
    
    public Charmander() {
        super();
    }
    
    public Charmander(int salud, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial) {
        super(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);
    }
    
    public String toString() {
        String charmander = "Charmander";
        
        return charmander;
    }
    
}
