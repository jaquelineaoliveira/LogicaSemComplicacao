package desafio;

public class DesafioExercicios {
	
	/* 1. Criar um m�todo para calcular e retornar a �rea de um triangulo,
	 *    esse m�todo deve receber dois valores inteiros referente a base e altura do triangulo.
	 */
	
	public int CalcularArea (int base, int altura) {
		int area; 
		area = (base * altura) / 2; 
		return area; 
		
	}
	
	/* 2. Criar um m�todo que receber� 3 valores inteiros e dever� retornar o maior deles.	 */
	
	public int MaiorValor (int valor1, int valor2, int valor3) {

				
		if (valor1 > valor2 && valor1 > valor3) { 
			return valor1; 
			
		} else if (valor2 > valor1 && valor2 > valor3) {
			return valor2; 
		} 
			return valor3; 
		
		
		
	}
	
	/*3.  Criar um m�todo que dever� retornar a soma dos n�meros inteiros positivos do intervalo de um a cem.*/
	
		public int SomaInteiros () { 
			
			int soma = 0; 
	
			for (int i = 1;i<= 100;i++) {
				soma = soma + i ;
		}
			return soma; 
	}

}

