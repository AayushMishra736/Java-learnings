package org.ArrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistAddition {

	public static void main(String[] args) {
		ArrayList<Player> list = new ArrayList<>();
		list.add(new Player("Hardik", 100, 2, "India", 4, "A"));
		list.add(new Player("Chahal", 92, 5, "India", 14, "B"));
		list.add(new Player("Peter", 134, 7, "India", 23, "B"));
		list.add(new Player("Robert", 137, 8, "India", 8, "B"));
		list.add(new Player("Tony", 195, 9, "India", 9, "B"));

		int max_run = list.get(0).getTotalRun();

		for (Player p : list) {
			System.out.println("PlayerName : " + p.getPlayerName() + ", Total Run :" + p.getTotalRun() + ", NoOfWicket "
					+ p.getNoOfWicket() + ", country " + p.getCountry() + ", No_Of_century " + p.getNo_Of_century()
					+ ", Category : " + p.getCategory());
		}

		System.out.println("--------------------------------------*--------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			if (max_run < list.get(i).getTotalRun()) {
				max_run = list.get(i).getTotalRun();
			}
		}
		System.out.println("Highest Run Scored By Player Is : " + max_run);

		System.out.println("--------------------------------------*--------------------------------------");

		Collections.sort(list, new classSortByName());

		for (Player p : list) {
			System.out.println("PlayerName : " + p.getPlayerName() + ", Total Run :" + p.getTotalRun() + ", NoOfWicket "
					+ p.getNoOfWicket() + ", country " + p.getCountry() + ", No_Of_century " + p.getNo_Of_century()
					+ ", Category : " + p.getCategory());
		}
		
		System.out.println("--------------------------------------*--------------------------------------");
		
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).getTotalRun() == 100) {
				list.remove(i);
			}
		}

		for(Player p : list) {
			System.out.println("PlayerName : " + p.getPlayerName() + ", Total Run :" + p.getTotalRun() + ", NoOfWicket "
					+ p.getNoOfWicket() + ", country " + p.getCountry() + ", No_Of_century " + p.getNo_Of_century()
					+ ", Category : " + p.getCategory());
		}
		
		System.out.println("--------------------------------------*--------------------------------------");
		
		for(Player p : list) {
		String str;
		str =  p.getNo_Of_century() >= 10 ? "A":"B";
		p.setCategory(str);
		}
		
		
		for(Player p : list) {
			System.out.println("PlayerName : " + p.getPlayerName() + ", Total Run :" + p.getTotalRun() + ", NoOfWicket "
					+ p.getNoOfWicket() + ", country " + p.getCountry() + ", No_Of_century " + p.getNo_Of_century()
					+ ", Category : " + p.getCategory());
		}
		
	}
}

class classSortByName implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getPlayerName().compareTo(o2.getPlayerName());
	}

}
