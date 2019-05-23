package model;

import contract.IInteractions;

public class Score implements IInteractions{

	public int Score = 0;
	
public Score() {
	
}

public int getScore() {
	return this.Score;
}

public void setScore(int score) {
	this.Score = score;
}

}
