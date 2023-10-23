package com.sanjay.TIcTacToe;

public class Player {
	public String name;
	public PlayingPiece playingPiece;
	
	public Player(String name,PlayingPiece playingPiece) {
		this.name = name;
		playingPiece = this.playingPiece;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayingPiece getPlayingPiece() {
		return playingPiece;
	}

	public void setPlayingPiece(PlayingPiece playingPiece) {
		this.playingPiece = playingPiece;
	}
	
}
