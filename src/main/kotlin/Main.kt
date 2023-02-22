import java.util.*

fun main(){
   members("Winayo","Dolayo","Daniel","Jane")
   cities()
   element()
   println(names("Emma","Winner","Dollar"))








   }
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array

fun members(name1:String,name2:String,name3:String,name4:String){
   var students= arrayOf(name1,name2,name3,name4)
   println(students.contentToString())
}
//Create a function that given an array below:
//
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.


fun cities() {
   var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
   cities.forEach { city -> println(city.capitalize()) }
}
   //3. Create one function that given the below array:
   //
   //var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
   //(i) prints out the sum of the second and fifth elements (1 point)
   //(ii) prints out the index of 158 (1 point)
   //(iii) prints out the elements in ascending order

   fun element() {
      val numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
      println(numbers[1] + numbers[4])
      println(numbers.indexOf(158))

      var sortedNumbers = numbers.sortedArray()
      println(Arrays.toString(sortedNumbers))}

      //4. Create a function that takes in 3 names and returns a string array containing
      //all 3 names.


fun names(name1: String,name2: String,name3: String):String{
   var names= arrayOf(name1,name2,name3)
   return names.contentToString()
}












