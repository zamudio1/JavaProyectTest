package JuegoPokemon;

public abstract class PokemonFuego extends Pokemon{
    public PokemonFuego() {
        super();
    }
    
    public PokemonFuego(int salud, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial) {
        super(salud, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial);    
    }
    
    public String toString() {
        return "Pokemon Fuego{" + "apodo=" + apodo + ", salud=" + salud + ", ataque=" + ataque + ", defensa=" + defensa + ", velocidad=" + velocidad + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial + ", nivel=" + nivel + ", experiencia=" + experiencia + '}';
    }
    
    public void imprimirTipoPokemon() {
        System.out.println("Pokemon tipo fuego");
    }
}
