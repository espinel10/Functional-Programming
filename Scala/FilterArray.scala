val y=3
val ar=List(1,2,3,4,5,6,9,8,88)
def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)
val mostrar=f(y,ar)
for (e <- mostrar) println(e)
