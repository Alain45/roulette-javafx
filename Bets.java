package application;
import java.util.ArrayList;

public class Bets {
	
	private class Bet{
		String name = "";
		int stake = 0;
		int[] numbers = null;
	}
	
	private ArrayList<Bet[]> straight = new ArrayList<>();
	private ArrayList<Bet[]> split = new ArrayList<>();
	private ArrayList<Bet[]> street = new ArrayList<>();
	private ArrayList<Bet[]> square = new ArrayList<>();
	private ArrayList<Bet[]> dstreet = new ArrayList<>();
	private ArrayList<Bet[]> column = new ArrayList<>();
	private ArrayList<Bet[]> dozen = new ArrayList<>();
	private ArrayList<Bet[]> dcolumn = new ArrayList<>();
	private ArrayList<Bet[]> ddozen = new ArrayList<>();
	
	private int red = 0;
	private int black = 0;
	private int even = 0;
	private int odd = 0;
	private int low = 0;
	private int high = 0;
	
}