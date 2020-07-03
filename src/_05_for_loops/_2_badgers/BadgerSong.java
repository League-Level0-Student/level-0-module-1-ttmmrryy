package _05_for_loops._2_badgers;

public class BadgerSong {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print("badger ");
			}
			System.out.println("");
			for (int j = 0; j < 2; j++) {
				System.out.print("mushroom ");
			}
			System.out.println("");
		}
		System.out.println("Snake!");
	}
}
