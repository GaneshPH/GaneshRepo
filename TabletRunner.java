class TabletRunner{
public static void main(String[] args){
	
	Tablet.name="Paracetamol";
	Tablet.price=2d;
	Tablet.recoverfromfever=true;
	Tablet.colour="White";
	Tablet.manufacturer="Bharath Chemicals";
	Tablet.mfgDate="21/09/2022";
	Tablet.expDate="22/09/2025";
	Tablet.availabilityinmedicals=true;
	Tablet.forChildren=true;
	Tablet.rating=6.5d;
	Tablet.totakeperDay=3;
	Tablet.positiveresponse="60%";
	Tablet.negativeresponse="27%";
	Tablet.Stock=3000;
	Tablet.modeoftransport="Truck";
	Tablet.homeDelivery=true;
	Tablet.availabilityinnetmeds=true;
	
	String[] ary1={"Cipla","para lab"};
	Tablet.otherCompany=ary1;
	
	String[] ary2={"nicip","paracetamol"};
	Tablet.otherTablet=ary2;
	
	double[] ary3={2.5d,3.0d,3.5d};
	Tablet.difPrices=ary3;
	
	String[] ary4={"Head ache","Fever"};
	Tablet.cures=ary4;
	
	String[] ary5={"India","UK","UAE"};
	Tablet.availableIn=ary5;
	
	String[] ary6={"Blue","white"};
	Tablet.color=ary6;
	
	String[] ary7={"Apollo","Medplus"};
	Tablet.stores=ary7;
	
	char[] ary8={'s','l'};
	Tablet.boxSize=ary8;
	
	int[] ary9={10,30,60};
	Tablet.sheetSize=ary9;
	
	String[] ary10={"Good","okay","better"};
	Tablet.reviews=ary10;
	
	String[] ary11={"round","oval"};
	Tablet.shapes=ary11;
	
	int[] ary12={8,9,7};
	Tablet.marks=ary12;
	
	Tablet.tabletDetails();
	
	
}


}