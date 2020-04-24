package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	public static void JuegoPokemon (String args){
		float resultado = JuegoPokemon.Pokemon.DAÑOATAQUE1;
		float esperado = 0.4f;
		assertEquals(resultado, esperado);
	}

	}
