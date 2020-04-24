package Pokemon;

import JuegoPokemon.PokemonFuego;

public final class Vulpix extends PokemonFuego{
    public Vulpix() {
        super();
    }
    
    public Vulpix(int salud, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial) {
        super(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);
    }
    
    public String toString() {
        String vulpix = "Vulpix";
        
        return vulpix;
    }
    
    
}