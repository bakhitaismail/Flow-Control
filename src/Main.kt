fun main(){
    numbers()
    var c = names(arrayOf("1, 2, 3, 4, 5, 6, 67"))
    var j=names(arrayOf("Ramadhan", "AkiraChix", "Manchester", "Amin"))
    println(j)
    serve(12)
    multiple()
}
fun numbers(){
    for (nums in 1..100){
        if ((nums % 2) != 0){
            println(nums)
        }
    }
}
fun names(name: Array<String>): Int{
    var names=0
    name.forEach { x ->
        if(x.length>5){
            names++
        }
    }
    return names

}

fun serve(guests: Int){
    if(guests<=6){
        println("milk")
    }
    else if (guests >=6 && guests <=15){
        println("fanta orange")

    } else{
        println("coca cola")
    }
}
fun multiple(){
    for(numb in 1..100){
    if((numb%3)==0  && (numb%5)==0){
        println("FizzBuzz")
    }else if((numb%3)==0){
        println("Fizz")
    }else if((numb%5)==0){
        println("Buzz")
    }else{
        println(numb)
    }
    }
}




