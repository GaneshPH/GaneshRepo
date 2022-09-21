class SportsRunner{
	public static void main(String[] cricket)
	{
		System.out.println("cricket aador hesru");
		String[] PlayerNames={"Virat Kohli","Rohit Sharma","Shreyas Iyer",
		"Rishabh Pant","Hardhik Pandya","Dinesh Karthik","Jadeja","Harshal Patel",
		"Bhuvaneshvar Kumar","Jasprith Bhumrah","Yuzvendra Chahal"};
		Sports.cricketTeamMembers(PlayerNames);
	
		System.out.println("kabbaddi aador jerseyNumbers");
		int[] JerseyNos={18,45,41,17,19,33,07};
		Sports.kabbadiTeamMembersJerseyNos(JerseyNos);
		
		System.out.println("football aatagarara pagara varshakke");
		double[] salary={12345,67890,98765,43211,91827,36455,543216,85236,98741,25896,77777};
		Sports.FootBallTeamMembersSalary(salary);
	
		System.out.println("ludo aador mobile number");
		long[] MobileNos={987654320L,321569870L,789654123L,6547893210L};
		Sports.LudoTeamMobileNumber(MobileNos);
		
		System.out.println("yest match aadyara hockey players");
		int[] MatchNos={1,2,3,4,5,6,7,8,9,10,20};
		Sports.HockeyTeamMembersNoOfMatches(MatchNos);
		
		System.out.println("khokho aador country code");
		long[] CountryCode={91,91,91,91,91,91,91,91,91};
		Sports.KokoTeamMembersCountryCode(CountryCode);
		
		System.out.println("lagori aador adaro sattaro");
		boolean[] Alive={false,false,false,false,false,false,false};
		Sports.LagoriTeamMembersAlive(Alive);
		
	}
}