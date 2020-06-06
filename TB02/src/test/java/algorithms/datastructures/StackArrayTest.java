package test.java.algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.algorithms.datastructures.StackArray;

class StackArrayTest {

	@Test
	void testaInsercaoNaPilha() {
		StackArray array = new StackArray();
		assertEquals(0, array.size());
		array.push(15);
		assertEquals(1, array.size());
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

}
