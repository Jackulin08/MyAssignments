package week3.day2;

//Subclass of Browser

public class Edge extends Chrome {
	public void takeSnap() {
		System.out.println("Snap is taken");
	}
    public void clearCookies() {
    	System.out.println("Cookies are cleared");
    }
    public static void main(String[] args) {
    	
    Edge ed= new Edge();
    ed.clearCache();
    ed.clearCookies();
    ed.openIncognito();
    ed.takeSnap();
    
    
	
		
		}
		

	}


