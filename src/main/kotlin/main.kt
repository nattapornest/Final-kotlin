fun main() {
    var animal = Animal()
    animal.makeNoise()

    println("-------------")
    var myhipp = Hippo()
    myhipp.eat()
    myhipp.makeNoise()

    println("-------------")
    var myfeline = Feline()
    myfeline.roam()

    println("-------------")
    var mylion = Lion()
    mylion.makeNoise()
    mylion.eat()

    println("-------------")
    var mycheetah = cheetah()
    mycheetah.makeNoise()
    mycheetah.eat()

    println("-------------")
    var myLynx = Lynx()
    myLynx.makeNoise()
    myLynx.eat()


    println("-------------")
    var canine = Canine()
    canine.roam()

    println("-------------")
    var wolf = Wolf()
    wolf.makeNoise()
    wolf.eat()
    println("-------------")
    var myfox = fox()
    myfox.makeNoise()
    myfox.eat()

    println("-----สัตวแพทย์ฉีดยา--------")
    val myvet = vet()
    myvet.giveShot(myhipp)
    myvet.giveShot(myLynx)
    myvet.giveShot(mycheetah)
    myvet.giveShot(mylion)
    myvet.giveShot(wolf)
    myvet.giveShot(myfox)

}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open var hunger = 10

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
    override val habitat = "น้ำ"
    override var hunger = 20

    override fun makeNoise() {
        println("Grunt!")
    }

    override fun eat() {
        println("ฮิบโปกิน $food")
    }

}

open  class Feline : Animal(){
    override fun roam() {
       println("คลาส Feline กำลังเดินและปีนต้นไม้")
    }
}


class Lion : Feline(){
    override val image = "Lion.jpg"
    override val food = "เนื้อ"
    override val habitat = "ป่า"

    override fun makeNoise() {
        println("ร้องคำรามแบบสิงโต")
    }
    override fun eat(){
        println("สิงโตกิน $food")
    }
}

class cheetah : Feline(){
    override val image = "cheetah.jpg"
    override val food = "เนื้อ"
    override val habitat = "ที่มีต้นไม้"

    override fun makeNoise() {
        println("ร้องคำรามแบบเสือชีตาร์")
    }
    override fun eat(){
        println("cheetah กิน $food")
    }
}

class Lynx : Feline(){
    override val image = "Lynx.jpg"
    override val food = "เนื้อและพืช"
    override val habitat = "พุ่มไม้"

    override fun makeNoise() {
        println("ร้องแบบแมวป่า")
    }
    override fun eat(){
        println("Lynx กิน $food")
    }
}

open  class Canine : Animal(){
    override fun roam() {
        println("คลาส Feline กำลังเดินบนพื้น]")
    }
}

class Wolf : Canine(){
    override val food = "เพดดีกรี"
    override val habitat = "ถ้ำ"
    override val image = "wolf.jpg"
    override fun makeNoise() {
        println("ร้องคำรามแบบหมาป่า")
    }
    override fun eat() {
        println("หมาป่ากิน $food")
    }
}

class fox : Canine(){
    override val food = "เนื้อ"
    override val habitat = "โพรงหญ้า"
    override val image = "fox.jpg"
    override fun makeNoise() {
        println("ร้องคำรามแบบfox")
    }
    override fun eat() {
        println("fox $food")
    }
}

class vet {
    fun giveShot(animal: Animal){
        animal.makeNoise()

    }

}