object Main {
    def check(board: Array[Char]) : Char = {
        val list = List((0,1,2), (0,3,6), (0,4,8), (2,4,6), (3,4,5), (6,7,8), (1,4,7), (2,5,8))
        for(l <- list){
            if(board(l._1) == board(l._2) && board(l._1) == board(l._3)){
              if(board(l._1) == 'o') return 'o'
              else if(board(l._1) == 'x') return 'x'
            }
        }
        return 'd'
    }
    def main(args:Array[String]) = {
        val sc = new java.util.Scanner(System.in)
        while(sc.hasNext){
            val board = sc.next.toCharArray
            println(check(board))
        }
    }
}