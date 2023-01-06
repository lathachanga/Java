class Switch{
	public static void main(String args[]){
		int month=7;
		String  monthString="";
		switch(month){
			case 1:monthString="1-jan";
			break;
			case 2:monthString="2-feb";
			break;
			case 3:monthString="3-mar";
			break;
			case 4:monthString="4-apr";
			break;
			case 5:monthString="5-may";
			break;
			case 6:monthString="6-june";
			break;
			case 7:monthString="7-july";
			break;
			case 8:monthString="8-aug";
			break;
			case 9:monthString="9-sep";
			break;
			case 10:monthString="10-oct";
			break;
			case 11:monthString="11-nav";
			break;
			case 12:monthString="12-dec";
			break;
			default:System.out.println("Inavalid month");
		}
		System.out.println(monthString);
	}
}