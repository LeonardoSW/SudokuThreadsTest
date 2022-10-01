package Threads;

import java.util.ArrayList;

public class ThreadVLinha extends Thread{

	int[][] board;
	
	public ThreadVLinha(int[][] sudoku) 
	{
		board = sudoku;
	}
	
	public void run() {
		boolean valido = true;
		boolean validoGeral = true;
		
		for(int li = 0; li != 9; li++)
		{
			ArrayList<Integer> line = new ArrayList<Integer>();
			for(int col=0; col != 9; col++) 
			{
				int value = board[li][col];
				if(value != 0)
					if(valido = true)
					valido = !line.contains(value);
					if(valido == true)
						line.add(value);
					else{
						validoGeral = valido;
						System.out.println("* LINHA INVALIDA: Linha " + li + ", coluna " + col + " *");
						break;
					}
			}
		}
		if(validoGeral)
			System.out.println("As linhas do Sudoku estao validas.");
	}
}
