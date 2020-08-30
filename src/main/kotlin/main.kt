fun main() {
    var animal = Animal()
    animal.makeNoise()

    println("-------------")
    var myhipp = Hippo()
    myhipp.eat()
    myhipp.roam()
    myhipp.makeNoise()
    myhipp.sleep()
    myhipp.hunger
}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open var hunger = "10"

    open  fun makeNoise(){
        println("The Animal is กำลังส่งเสียงร้อง")
    }
    open  fun eat(){
        println("The Animal is กำลังกิน อาหาร")
    }
    open  fun roam(){
        println("The Animal is กำลัง เดิน")
    }
    open  fun sleep(){
        println("The Animal is กำลัง นอน")
    }
}

class Hippo : Animal(){
    override val image = "hippo.jpg"
    override val food = "หญ้า"
    override val habitat: String
        get() = "น้ำ"



}