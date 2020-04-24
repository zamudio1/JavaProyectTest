package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.ModuleLayer.Controller;

import org.junit.jupiter.api.Test;

import Controller.main;
import JuegoPokemon.Pokemon;

public class Test1 {

	
	@Test
	public static void Ataque (String args){
		String resultado = JuegoPokemon.Pokemon.ATAQUE1;
		String esperado = "Placaje";
		asserEquals(esperado, resultado);
	}

	private static void asserEquals(String esperado, String resultado) {
		
	}
}
