def f(arr:List[Int]):Int ={
   var x=0
   for (e<-arr) if (e%2!=0) x=x+e
   x
 }
