package view;

import Threads.ThreadVColuna;
import Threads.ThreadVGrid;
import Threads.ThreadVLinha;

/* OBSERVAÇÕES INICIAIS:
 *
 * AS COLUNAS COM VALOR 0 REPRESENTAM O NÃO 
 * PREENCHIMENTO NUMERICO, ISSO PORQUE O JOGO 
 * PERMITE APENAS NUMEROS DE 1 A 9, ENTÃO 0 
 * SIGNIFICA A FALTA DE PREENCIMENTO POR PARTE 
 * DO USUARIO.
 * 
 */

public class ISudoku {

	public static void main(String[] args) {

		int[][] board = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
						 {6, 7, 2, 1, 9, 5, 3, 4, 8},
						 {1, 9, 8, 3, 4, 2, 5, 6, 7},
						 {8, 5, 9, 7, 6, 1, 4, 2, 3},
						 {4, 2, 6, 8, 5, 3, 7, 9, 1},
						 {7, 1, 3, 9, 2, 4, 8, 5, 6},
						 {9, 6, 1, 5, 3, 7, 2, 8, 4},
						 {2, 8, 7, 4, 1, 9, 6, 3, 5},
						 {3, 4, 5, 2, 8, 6, 1 ,7 ,9}};
		
		ThreadVLinha validacaoLinha = new ThreadVLinha(board);
		ThreadVColuna validacaoColuna = new ThreadVColuna(board);
		
		ThreadVGrid validacaoSuperiorGrid1 = new ThreadVGrid(board, 0, 3, 0, 3, "Superior Esquerdo");
		ThreadVGrid validacaoSuperiorGrid2 = new ThreadVGrid(board, 0, 3, 3, 6, "Superior Central");
		ThreadVGrid validacaoSuperiorGrid3 = new ThreadVGrid(board, 0, 3, 6, 9, "Superior Direito ");
		
		ThreadVGrid validacaoCentralGrid1 = new ThreadVGrid(board, 3, 6, 0, 3, "Central Esquerdo");
		ThreadVGrid validacaoCentralGrid2 = new ThreadVGrid(board, 3, 6, 3, 6, "Central Centro");
		ThreadVGrid validacaoCentralGrid3 = new ThreadVGrid(board, 3, 6, 6, 9, "Central Direito ");
		
		ThreadVGrid validacaoInferiorGrid1 = new ThreadVGrid(board, 6, 9, 0, 3, "Inferior Esquerdo");
		ThreadVGrid validacaoInferiorGrid2 = new ThreadVGrid(board, 6, 9, 3, 6, "Inferior Central");
		ThreadVGrid validacaoInferiorGrid3 = new ThreadVGrid(board, 6, 9, 6, 9, "Inferior Direito ");
		
		validacaoLinha.start();
		validacaoColuna.start();
		
		validacaoSuperiorGrid1.start();
		validacaoSuperiorGrid2.start();
		validacaoSuperiorGrid3.start();
		
		validacaoCentralGrid1.start();
		validacaoCentralGrid2.start();
		validacaoCentralGrid3.start();
		
		validacaoInferiorGrid1.start();
		validacaoInferiorGrid2.start();
		validacaoInferiorGrid3.start();
	}
	
	/* OBSERVAÇÕES FINAIS:
	 * 
	 * AO FINALIZAR A EXECUÇÃO, NO CONSOLE DA APLICAÇÃO
	 * SERÁ POSSIVEL VISUALIZAR CASO TENHA ENCONTRADO
	 * ALGUMA DIVERGENCIA, APONTANDO O LOCAL ONDE ESTÁ A 
	 * DUPLICIDADE PARA AS LINHAS E COLUNAS, E  
	 * PARA CADA GRID, MOSTRARÁ SE ELE É VÁLIDO OU NÃO.
	 * 
	 */
}




