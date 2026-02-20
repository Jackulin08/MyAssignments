package week3.day2;

//Subclass of Browser

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println(" The Incognito is Opened");
	}
	public void clearCache() {
		System.out.println(" The Cache is cleared");
	}
   public static void main(String[] args) {
	   
	   Chrome ch= new Chrome();
	   ch.clearCache();
	   ch.openIncognito();
	   ch.loadUrl();
	   ch.closeBrowser();
	   ch.navigateBack();
		

	}

}
