import scala.math._

object Main {
	def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a%b)
	def lcm(a: Int, b: Int): Int = a*b/gcd(a,b)
	def lcm(array: Array[Int]): Int = {
		var tmp = array(0)
		for(i <- 1 until array.length) tmp = lcm(tmp, array(i))
		return tmp
	}

	
	def main(args: Array[String]) = {
		val sc = new java.util.Scanner(System.in)
		val n = sc.nextInt
		sc.nextLine
		val nums = sc.nextLine.split(' ').map(_.toInt)
		println(lcm(nums))
		
	}

}