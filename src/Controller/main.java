package Controller;


import Pokemon.Charmander;
import Pokemon.Charmeleon;
import Pokemon.Vulpix;

public class main {

    public static void main(String[] args) {
        
        Charmander pokemon2 = new Charmander(100, 20, 20, 0, 0, 0);
        Charmeleon pokemon1 = new Charmeleon(100, 20, 20, 20, 20, 20);
        Vulpix pokemon3 = new Vulpix(100, 20, 20, 0, 0, 0);
        System.out.println(pokemon1);
        pokemon1.imprimirTipoPokemon();
        System.out.println("");
        System.out.println(pokemon2);
        pokemon2.imprimirTipoPokemon();
        System.out.println("");
        System.out.println(pokemon3);
        pokemon3.imprimirTipoPokemon();
    }
    
}

