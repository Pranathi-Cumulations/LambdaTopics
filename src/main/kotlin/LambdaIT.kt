//it keyword is generally used in case of lambda functions with single parameters

fun main(){
    var nums = intArrayOf(1,4,6,5)
    var numsFilered = nums.filter { it % 2 ==0 }
    for (i in numsFilered){
        println(i)
    }

}