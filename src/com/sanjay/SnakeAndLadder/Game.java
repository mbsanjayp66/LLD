package com.sanjay.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	Board board;
	Dice dice;
	Deque<Player>playersList = new LinkedList<>();
	Player winner;
	public Game() {
		initializeGame();
	}
	public void initializeGame() {
		board = new Board(10,5,4);
		dice = new Dice(1);
		winner = null;
		addPlayers();
	}
	public void addPlayers() {
		Player player1 = new Player("Sanjay", 0);
		Player player2 = new Player("Pankaj", 0);
		playersList.add(player1);
		playersList.add(player2);
		for(Player p:playersList ) {
			System.out.println("data: "+p.id);
		}
	}
	public void startGame() {
		while(winner==null) {
			Player playerTurn = findPlayerTurn();
			//System.out.println(playerTurn.id);
			System.out.println("Player Turn is: "+playerTurn.id+" current Position is: "+playerTurn.currentPosition);
			int diceNumber = dice.rollDice();
			
			int playerNewPosition = playerTurn.currentPosition+diceNumber;
			playerNewPosition = jumpCheck(playerNewPosition);
			playerTurn.currentPosition = playerNewPosition;
			System.out.println("player turn is: "+playerTurn.id+" player new Position is "+playerTurn.currentPosition);
			if(playerTurn.currentPosition>=board.cells.length*board.cells.length) {
				winner = playerTurn;
			}
		}
		System.out.println("Winner is:"+winner.id);
	}
	public int jumpCheck(int playerNewPosition) {
		if(playerNewPosition>=board.cells.length*board.cells.length){
			return playerNewPosition;
		}
		Cell cell = board.getCell(playerNewPosition);
		
		if(cell.jump!=null && cell.jump.start==playerNewPosition) {
			String jumpBy = (cell.jump.start<cell.jump.end)?"Ladder":"snake";
			System.out.println("Jump Done By:"+jumpBy);
			return cell.jump.end;
		}
		return playerNewPosition;
	}
	public Player findPlayerTurn() {
		Player p1 = playersList.removeFirst();
		playersList.addLast(p1);
		return p1;
	}
}
