object Solution extends App {

    def f(num:Int) : List[Int] = {
        val list = List.range(0,num)

        print(list + "\n")
        return list
    }

    println(f(readInt))
}
