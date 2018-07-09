package Roulette;
import java.util.ArrayList;

public class Bets {
	
	private class Bet{
		//String name = "";
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
	
	private Bet red = null;
	private Bet black = null;
	private Bet even = null;
	private Bet odd = null;
	private Bet low = null;
	private Bet high = null;
}