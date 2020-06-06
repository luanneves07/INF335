package test.java.algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.algorithms.datastructures.StackArray;

class StackArrayTest {

	@Test
	void testaInsercaoNaPilha() {
		StackArray array = new StackArray();
		array.push(15);
		assertEquals(false, array.isEmpty());
	}
	
	@Test
	void testaRemocaoNaPilha() {
		StackArray array = new StackArray();
		array.push(15);
		array.pop();
		assertEquals(true, array.isEmpty());
	}
	
	@Test
	void testaConsultaDoUltimoElementoAdicionadoNaPilha() {
		StackArray array = new StackArray();
		array.push(15);
		assertEquals(15, array.peek());
	}

	@Test
	void testaVerificacaoDeTamanho() {
		StackArray array = new StackArray();
		assertEquals(true, array.isEmpty());
		array.push(15);
		assertEquals(false, array.isEmpty());
	}
	
	@Test
	void testaIdentificacaoDeArrayCheio() {
		StackArray array = new StackArray();
		int[] samples = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i : samples) {
			array.push(i);
		}
		assertEquals(true, array.isFull());
	}
	
	@Test
	void testaContadorDeTamanhoDoArray() {
		StackArray array = new StackArray();
		int[] samples = {0, 1};
		for (int i : samples) {
			array.push(i);
		}
		assertEquals(2, array.size());
	}
	
	@Test
	void testaLimpadorDoArray() {
		StackArray array = new StackArray();
		int[] samples = {0, 1};
		for (int i : samples) {
			array.push(i);
		}
		array.makeEmpty();
		assertEquals(true, array.isEmpty());
	}
	
	
}
