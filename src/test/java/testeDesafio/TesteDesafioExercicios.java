package testeDesafio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desafio.DesafioExercicios;

public class TesteDesafioExercicios {
	
	DesafioExercicios desafioExercicios= new DesafioExercicios(); 
	
		/* 1. Criar um m�todo para calcular e retornar a �rea de um triangulo,
		 *    esse m�todo deve receber dois valores inteiros referente a base e altura do triangulo.
		 */
		
		@Test
		public void TesteCalcularArea() {
			
			int area = this.desafioExercicios.CalcularArea(10, 5); 
			assertEquals(25, area);
			
		}
		
		/* 2. Criar um m�todo que receber� 3 valores inteiros e dever� retornar o maior deles.	 */
		
		@Test
		public void TesteMaiorValor() {
			
			int maiorValor = this.desafioExercicios.MaiorValor(9, 5, 23); 
			assertEquals(23, maiorValor);
			
		}
		
		
		/*3.  Criar um m�todo que dever� retornar a soma dos n�meros inteiros positivos do intervalo de um a cem.*/
		@Test 
		public void TesteSomaInteiros() {
		
			int soma = this.desafioExercicios.SomaInteiros(); 
			assertEquals(5050, soma);
			
		}
	}
