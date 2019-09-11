import java.util.*; 
public class Main 
{
	public static void main(String[] args)
	{
		League<Team<FootballPlayer>> footbalLeague= new League("EPL");
		Team<FootballPlayer> juventus= new Team<>("Juventus");
		Team<FootballPlayer>barcelona= new Team<>("Barcelona");
		Team<FootballPlayer>chelsea= new Team<>("Chelsea");
		Team<FootballPlayer>bayernMunich= new Team<>("Bayern Munich");

		Team<BaseballPlayer>baseballTeam=new Team<>("Chicago Cubs");
		footbalLeague.add(juventus);
		footbalLeague.add(barcelona);
		footbalLeague.add(chelsea);
		footbalLeague.add(bayernMunich);

		//footbalLeague.add(baseballTeam);

		footbalLeague.showLeagueTable();

		chelsea.matchResult(juventus,1,3);
		barcelona.matchResult(bayernMunich,4,3);
		chelsea.matchResult(bayernMunich,0,4);
		juventus.matchResult(barcelona,2,1);
		
		footbalLeague.showLeagueTable();

	}
} 