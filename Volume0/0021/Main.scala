object Main {
 
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        val n = sc.nextInt
        while(sc.hasNext){
            val x1,y1,x2,y2,x3,y3,x4,y4 = sc.nextDouble
            if(Math.abs((x1-x2)*(y3-y4) - (x3-x4)*(y1-y2)) < 1e-10) println("YES") else println("NO")
        }
    }
}