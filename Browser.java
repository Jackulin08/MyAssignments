package assgn1.day1;

public class Browser {
	 

	public String launchBrowser(String browserName) {
		 System.out.println("Browser Launced Successfully");
		return browserName; 
	}
		 
		void loadUrl() {
			System.out.println("Application Url loaded successfully");
			
		}
			
			
			public static void main(String[] args) {
				Browser browser = new Browser();
				browser.launchBrowser(null);
				browser.loadUrl();
			}
			
}
	 



   