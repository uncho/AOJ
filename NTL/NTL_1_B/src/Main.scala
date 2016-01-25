object Main {
	
	// 繰り返し二乗法　O(log n)
	def pow(x: BigInt, n: Int, m: Int): BigInt = n match{
		case 0 => 1
		case n if n%2==0 => pow(x*x, n/2, m) % m
		case n if n%2!=0 => pow(x*x, n/2, m) * x % m
	}
	
	def main(args: Array[String]) = {
		val sc = new java.util.Scanner(System.in)
		val m,n = sc.nextInt
		
		println(pow(m,n,1000000007))
	}

}