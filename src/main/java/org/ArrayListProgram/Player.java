package org.ArrayListProgram;

public class Player {
	private String playerName;
    private int totalRun;
    private int noOfWicket;
    private String country;
    private int no_Of_century;
    private String Category;

Player(String playerName,int totalRun,int noOfWicket,String country,int no_Of_century,String Category){
this.playerName = playerName;
this.totalRun = totalRun;
this.noOfWicket = noOfWicket;
this.country = country;
this.Category = Category;
this.no_Of_century = no_Of_century;
}

Player(){
}


public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public int getTotalRun() {
	return totalRun;
}

public void setTotalRun(int totalRun) {
	this.totalRun = totalRun;
}

public int getNoOfWicket() {
	return noOfWicket;
}

public void setNoOfWicket(int noOfWicket) {
	this.noOfWicket = noOfWicket;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getNo_Of_century() {
	return no_Of_century;
}

public void setNo_Of_century(int no_Of_century) {
	this.no_Of_century = no_Of_century;
}

public String getCategory() {
	return Category;
}

public void setCategory(String category) {
	Category = category;
}




}