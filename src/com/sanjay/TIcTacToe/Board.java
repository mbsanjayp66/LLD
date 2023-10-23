package com.sanjay.TIcTacToe;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Board {
	int size;
	public PlayingPiece[][] board;
	
	public Board(int size) {
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}

	public void printBoard() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]==null) {
					System.out.print("  ");
				}else {
					System.out.print(board[i][j]+"  ");
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public List<Pair<Integer, Integer>> getFreeCells() {
		List<Pair<Integer, Integer>>freeList = new ArrayList<>();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j]==null) {
					freeList.add(new Pair<Integer, Integer>(i,j));
				}
			}
		}
		return freeList;
	}

	public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
		if(board[inputRow][inputCol]!=null) {
			return false;
		}
		board[inputRow][inputCol] = playingPiece;
		return true;
	}
}
