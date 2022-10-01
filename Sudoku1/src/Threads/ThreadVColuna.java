package Threads;

import java.util.ArrayList;

public class ThreadVColuna extends Thread{

	int[][] board;
	
	public ThreadVColuna(int[][] sudoku) 
	{
		board = sudoku;
	}
	
	public void run() {
		
		boolean valido = true;
		boolean validoGeral = true;
		
		for(int col = 0; col != 9; col++)
		{
			ArrayList<Integer> line = new ArrayList<Integer>();
			for(int li=0; li != 9; li++) 
			{
				int value = board[li][col];
				if(value != 0)
					if(valido = true)
					valido = !line.contains(value);
					if(valido == true)
						line.add(value);
					else{
						validoGeral = valido;
						System.out.println("* COLUNA INVALIDA: Linha " + li + ", coluna " + col + " *");
					}
			}
		}
		if(validoGeral)
			System.out.println("As colunas do Sudoku estao validas.");
	}
}
