package factorgenerator;

public class FactorGenerator {
	int number;
	int prime;

	// constructor
	public FactorGenerator(int numberToFactor) {
		number = numberToFactor;
		prime = 2;
	}

	public void nextFactor(int n) {
		if (n % this.prime == 0) {
			System.out.print(this.prime + " ");
			this.number = n / this.prime;	
		} else {
			nextPrime(this.prime);
		}
	}

	//	wheck if number have more factor or not
	public boolean hasMoreFactors(int p) {
		return (p != 1);
	}

	public void nextPrime(int p) {
		p++;
		while (!isPrime(p)) { p++; }
		this.prime = p;
	}

	public boolean isPrime(int n) {
		if (n < 2) { return false; }

		for (int i = 2;  i < n; i++) {
			if (n % i == 0) { 
				return false;
			} 
		}
		return true;
	}
}

