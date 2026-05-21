public class Farm
{
	public static String season = "summer";
	private int numCows;
	private int numGoats;
	
	public Farm(int cows, int goats) {
		numCows = cows;
		numGoats = goats;
	}
	
	public static String getSeason() {
		return season;
	}
	
	public static void setSeason(String newSeason) {
		season = newSeason;
	}
}