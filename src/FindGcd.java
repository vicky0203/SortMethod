
public class FindGcd {

	public FindGcd(){
		
	}
	
	public int findGcdMethodSimple(int m, int n){//找最大公约数   o(n)
		if(m == 0 || n==0 ) return 0;
		
		int gcd = 1;
		
		if(m > n){
			int temp = m;
			m = n;
			n = temp;
		}
		if (n % m == 0) return m;
		
		for(int k = n / 2; k>0; k--){
			if(m % k == 0 && n % k == 0){
				gcd = k;
				break;
			}
		}
		
		return gcd;
	}
	
	public int findGcdByRecursion(int m, int n){ //o(logn)
        if(m == 0 || n==0 ) return 0;
		
		if(m > n){
			int temp = m;
			m = n;
			n = temp;
		}
		if (n % m == 0){
			return m;
		}else{
			return findGcdByRecursion(m, n % m);
		}
		
	}
}
