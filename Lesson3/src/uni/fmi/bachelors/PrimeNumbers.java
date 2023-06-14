package uni.fmi.bachelors;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrime;
		
		for (int i = 0 ; i <= 1000 ; i++){
			isPrime = true;
			
			for (int j = 2 ; j < i / 2; j++ ){
				
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime){
				System.out.println(i);
			}
		}
	}

}
