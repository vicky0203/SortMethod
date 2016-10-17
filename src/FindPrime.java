
public class FindPrime {

	public void findPrime(int n) {//著名找素数Eratosthenes算法
		boolean[] primes = new boolean[n+1];
		
		for(int i=0; i< primes.length; i++){
			primes[i] = true;
		}
		
		for(int k=2; k<= n/k; k++){ // k=2,3...k2 = n
			if(primes[k]){
				for(int i=k; i<=n/k; i++){  //k*i = n  k的倍数
					primes[k*i] = false;
				}
			}
		}
		
		int count = 0;
		for(int i=2; i<primes.length;i++){
			if(primes[i]){
				count++;
				if(count % 10 == 0){   //10个一行
					System.out.printf("%7d\n", i);
				}else{
					System.out.printf("%7d", i);
				}
			}
		}
		
		System.out.println("\n" + count + " prime(s) less than or equal to " + n);
		
	}

}
