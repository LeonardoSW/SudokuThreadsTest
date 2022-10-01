package Threads;

import java.util.ArrayList;

public class ThreadVGrid extends Thread {

	int[][] board;
	int indexLinhaInicio;
	int indexLinhaFim;
	int indexColunaInicio;
	int indexColunaFim;
	String name;
	
	public ThreadVGrid( int[][] sudoku,
						int indexLinhaI, 
						int indexLinhaF,
						int indexColunaI, 
						int indexColunaF,
						String n) 
	{
		board = sudoku;
		indexLinhaInicio = indexLinhaI;
		indexLinhaFim = indexLinhaF;
		indexColunaInicio = indexColunaI;
		indexColunaFim = indexColunaF;
		name = n;
	}
	
	public void run() {
		
		boolean valido = true;
		boolean validoGeral = true;
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		for(int col = indexColunaInicio; col != indexColunaFim; col++) 
		{	
			for(int li = indexLinhaInicio; li != indexLinhaFim; li++) 
			{
				int value = board[li][col];
				if(value != 0)
					if(valido == true)
						valido = !data.contains(value);
					if(valido == true)
						data.add(value);
					else {
						validoGeral = valido;
					}
			}
		}
		
		if(validoGeral)
			System.out.println("Grid " + name + " VALIDO!");
		else
			System.out.println("* Grid " + name + " INVALIDO! *");
	}
}
