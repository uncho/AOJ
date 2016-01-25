import scala.math._

object Main {
	def calc(n:Int):List[Int] = {
		def calc(i:Int, n:Int):List[Int] = {
			if (i > sqrt(n)) List(n)
			else if (n%i == 0) i :: calc(i, n/i)
			else calc(i+1, n)
		}
		calc(2, n)
	}
	
	def main(args: Array[String]) = {
		val sc = new java.util.Scanner(System.in)
		val n = sc.nextInt
		
		println(n+": "+calc(n).mkString(" "))
	}
}