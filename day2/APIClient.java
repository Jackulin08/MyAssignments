package week3.day2;
// overloading concept
public class APIClient {
	
	public void sendRequest( String endpoint) {
		System.out.println("Send request to the endpoint");
		
	}

	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		System.out.println("Send request to the endpoint");
		System.out.println("Send request to the requestbody");
		System.out.println("The request is successfull or not");
	
		}
	public static void main(String[] args) {
		APIClient ac= new APIClient();
		ac.sendRequest("Request is Successful");
		ac.sendRequest("Request is not Successful","failed",false);
	}
				
	}
	


