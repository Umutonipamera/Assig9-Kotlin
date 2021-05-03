fun main(){

    println(names(listOf("Pamela","Diane","Juliet","Belyse","Josiane","Belinda","Brenda","Phiona","Jeanine","Phainah")))
    var peopleHeights=listOf(1.65,2.0,1.70,1.60,1.85)
    println(peopleHeights)
    println(peopleHeights.average())
    println(peopleHeights.sum())
    DescAge()
    AddObjects()
    var car= (listOf(
        Car("Rae572",120),
        Car("Rad324",100),
        Car("Rab670",80)
    )
    )
    println(carsObjects(car))
}

fun names(names:List<String>):List<String>{
    var evenIndexesNames=mutableListOf<String>()
    for(name in names){
        if( names.indexOf(name)%2==0){
            evenIndexesNames.add(name)
        }
    }
    return evenIndexesNames
}
data class AvgTotal(var average:Double,var total:Double)
fun peopleHeight(heights:List<Double>):AvgTotal {
    var average = heights.average()
    var sum = heights.sum()
    var AvgTotal = AvgTotal(average, sum)
    return AvgTotal
}

data class People(var name:String,var age:Int,var height:Double,var weight:Double)
fun DescAge(){
    var people= listOf(
        People("Pamela",22,1.65,60.0),
        People("Belyse",19,1.85,68.0),
       People("Celine",21,1.60,62.0),
       People("Diane",20,1.50,56.0))

    var sortedPeople=people.sortedByDescending{people->people.age}
    println(sortedPeople)

}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun AddObjects() {
    var people = mutableListOf(
        Person("Pamela", 22, 1.65, 60.0),
        Person("Belyse", 19, 1.85, 68.0),
        Person("Celine", 21, 1.60, 62.0),
        Person("Diane", 20, 1.50, 56.0)
    )
    people.addAll(
        listOf(
            Person("Jackeline", 30, 2.50, 88.0),
            Person("Peace", 28, 1.90, 82.0)
        )
    )
    println(people)

}
data class Car(var registration:String,var mileage:Int)
fun carsObjects(cars: List<Car>): Int {
    var addition = 0
    cars.forEach { car ->  addition+=car.mileage}
    return addition/cars.size
}