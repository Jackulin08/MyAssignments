package week3.day2;

public class OddToUppercase {
	public static void main(String[] args) {

		String test="changeme";
		char[] arr = test.toCharArray();
		for(int i = 1;i<arr.length;i++){
		
		if(i%2!=0){
			arr[i] = Character.toUpperCase(arr[i]);
		}
		}
			String result= new String(arr);
			System.out.println("Output="+result);
		}
		
		}




