package com.sanjay.TIcTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class TicTacToeGame {
	Deque<Player>players;
	Board gameBoard;
	
	TicTacToeGame(){
		initializeGame();
	}

	private void initializeGame() {
		players = new LinkedList<>();
		PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);
        players.add(player2);
        players.add(player1);

		gameBoard = new Board(3);
	}
	
	public String startGame() {
		boolean noWinner = true;
		while(noWinner) {
			Player playerTurn = players.removeFirst();
			gameBoard.printBoard();
			List<Pair<Integer, Integer>>freeSpace = gameBoard.getFreeCells();
			
			if(freeSpace.isEmpty()) {
				noWinner = false;
				continue;
			}
			System.out.println("Player:"+playerTurn.name+"Enter row,Col");
			Scanner inputScanner = new Scanner(System.in);
			String s = inputScanner.nextLine();
			String[] values = s.split(",");
			int inputRow = Integer.valueOf(values[0]);
			int inputCol = Integer.valueOf(values[1]);
			inputScanner.close();
			boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
			if(!pieceAddedSuccessfully) {
				System.out.println("Incorrect Position chosen,try Again");
				players.add(playerTurn);
				continue;
			}
			players.addLast(playerTurn);
			boolean winner = isThereWinner(inputRow,inputCol,playerTurn.playingPiece.pieceType);
			if(winner){
				return playerTurn.name;
			}
		}
		return "tie";
	}

	private boolean isThereWinner(int inputRow, int inputCol, PieceType pieceType) {
		boolean rowMatch = true;
		boolean colMatch = true;
		boolean dMatch = true;
		boolean adMatch = true;
		
		for(int j=0;j<gameBoard.size;j++) {
			if(gameBoard.board[inputRow][j]!=null && gameBoard.board[inputRow][j].pieceType!=pieceType) {
				rowMatch = false;
			}
		}
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][inputCol]!=null && gameBoard.board[i][inputCol].pieceType!=pieceType) {
				colMatch = false;
			}
		}
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][i]!=null && gameBoard.board[i][i].pieceType!=pieceType) {
				dMatch = false;
			}
		}
		
		int size = gameBoard.board.length;
		
		for(int i=0;i<gameBoard.size;i++) {
			if(gameBoard.board[i][size-i-1]!=null && gameBoard.board[i][size-i-1].pieceType!=pieceType) {
				adMatch = false;
			}
		}
		
		return rowMatch||colMatch||dMatch||adMatch;
	}
	
}
