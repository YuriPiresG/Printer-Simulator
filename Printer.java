public class Printer {

	private int tonerLevel;
	private int pagesPrinted=0;
	private boolean duplex;
	
	
	
	public Printer(int tonerLevel, boolean duplex) {
		super();
		if(tonerLevel<-1 || tonerLevel>100) {
			tonerLevel=-1;
		}
		
		this.tonerLevel = tonerLevel;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount<0 || tonerAmount>100) {
			return -1;
		}
		if((tonerAmount+tonerLevel)>100) {
			return -1;
		}
		return tonerLevel+=tonerAmount;
	}
	
	public int printPages(int pages) {
		int pagesToPrint=pages;
		if(duplex==true) {
			System.out.println("Printing in duplex mode");
			return pagesPrinted+=(pagesToPrint/2);
		}
		else {
			return pagesPrinted+=pages;
		}
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
