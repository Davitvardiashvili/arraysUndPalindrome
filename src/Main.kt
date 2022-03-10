fun array(x: Array<Int>): String {
    var sum = 0
    var i = 0
    var luwi_indexi = 0
    var luwi_sum = 0
    while (x.size > i){
        sum += x[i]
        i+=1
        if (i % 2 == 0) {
            luwi_sum += x[i]
            luwi_indexi+=1
        }
    }
    val jami = luwi_sum/luwi_indexi
    return "მასივის ელემენტთა შეკრების ჯამი: -> $sum \nლუწ ინდექსზე მდგომი რიცხვების საშუალო არითმეტიკული: -> $jami"
}
fun palindrome(x:String): Boolean {
    return x == x.reversed()

}
fun main(){
    //pirveli davaleba
    val numbers: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    val fin = array(numbers)
    println(fin)

    //meore davaleba
    val example: String = "baab"
    println(palindrome(example))
}
