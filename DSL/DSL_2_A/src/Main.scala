import scala.io.StdIn.readLine

object Main {

	def find(array: Seq[Int], s: Int, t: Int): Int = array.slice(s, t+1).min

	def update(array: Seq[Int], i: Int, x: Int): Seq[Int] = array.updated(i,x)

	def main(args: Array[String]){
		val in = readLine().split(" ").map(_.toInt)
		val n = in(0)
		val q = in(1)

		var a = Seq.fill(n)(Integer.MAX_VALUE)

		for(_ <- 1 to q){
			val in = readLine().split(" ").map(_.toInt)
			val com = in(0)
			val x = in(1)
			val y = in(2)

			if(com==0) a = update(a,x,y)
			else println(find(a,x,y))
		}
	}
}