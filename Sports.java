class Sports{
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("cricket aador hesru");
		System.out.println("Total cricketersNames:"+names.length);
		for(int index=0;index<names.length;index++)
		{
			String ref= names[index];
			System.out.println("Cricket Team Member Name:" +ref);
		}
	}
	static void kabbadiTeamMembersJerseyNos(int[] numbers)
	{
		System.out.println("kabbaddi aador jerseyNumbers");
		System.out.println("Total jerseyNumbers:"+numbers.length);
		for(int index=0;index<numbers.length;index++)
		{
			int ref=numbers[index];
			System.out.println("Kabbadi Team Jersey Number:" +ref);
		}
	}
	static void FootBallTeamMembersSalary(double[] salaries)
	{
		System.out.println("football aatagarara pagara varshakke");
		System.out.println("Total salary:"+salaries.length);
		for(int index=0;index<salaries.length;index++)
		{
			double ref=salaries[index];
			System.out.println("FootBall Members Salaries:"+ref);
		}
	}
	static void LudoTeamMobileNumber(long[] numbers)
	{
		System.out.println("ludo aador mobile number");
		System.out.println("Total playerNumber:"+numbers.length);
		for(int index=0;index<numbers.length;index++)
		{
			long ref=numbers[index];
			System.out.println("Ludo Mobile Number:" +ref);
		}
	}
	static void HockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("yest match aadyara hockey players");
		System.out.println("Total Matches:"+matches.length);
		for(int index=0;index<matches.length;index++)
		{
			int ref=matches[index];
			System.out.println("NoOfMatches:" +ref);
		}
	}
	static void KokoTeamMembersCountryCode(long[] names)
	{
		System.out.println("khokho aador country code");
		System.out.println("Total CountryCodes:"+names.length);
		for(int index=0;index<names.length;index++)
		{
			long ref=names[index];
			System.out.println("Koko Country code:" +ref);
		}
	}
	static void LagoriTeamMembersAlive(boolean[] name)
	{
		System.out.println("lagori aador adaro sattaro");
		System.out.println("Total membersAlive:"+name.length);
		for(int index=0;index<name.length;index++)
		{
			boolean ref=name[index];
			System.out.println("LagoriAlive:"+ ref);
		}
	}
}