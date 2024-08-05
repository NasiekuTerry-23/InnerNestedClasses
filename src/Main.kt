fun main(){

    val outerClass1 = OuterClass1.Nested()
    outerClass1.printMessage("Hello Mate!")
    val outerClass2 = OuterClass2().Nested()
    outerClass2.printMessage()
}

class OuterClass1{
    val apple = "apple"
    val number = 25

    class Nested{

        fun printMessage(message: String){

            println(message)
        }
    }
}

class OuterClass2{
    val apple = "apple"
    val number = 25

    inner class Nested{
        fun printMessage(){

            println("$apple is $number")

        }
    }
}