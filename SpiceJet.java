class SpiceJet{
	static void flight(String[] flightNo)
	{
		System.out.println("flight number");
		System.out.println("Total flightNos:"+flightNo.length);
		for(int index=0;index<flightNo.length;index++)
		{
			String ref= flightNo[index];
			System.out.println("Flight no:" +ref);
		}
	}
}