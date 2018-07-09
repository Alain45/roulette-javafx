package Roulette;
import java.util.ArrayList;

public class Bets {
	
	private class Bet{
		//String name = "";
		int stake = 0;
		int[] numbers = null;
	}
	
	private ArrayList<Bet> straight = null;
	private ArrayList<Bet> split = null;
	private ArrayList<Bet> street = null;
	private ArrayList<Bet> square = null;
	private ArrayList<Bet> dstreet = null;
	private ArrayList<Bet> column = null;
	private ArrayList<Bet> dozen = null;
	private ArrayList<Bet> dcolumn = null;
	private ArrayList<Bet> ddozen = null;
	
	private Bet red = null;
	private Bet black = null;
	private Bet even = null;
	private Bet odd = null;
	private Bet low = null;
	private Bet high = null;
}