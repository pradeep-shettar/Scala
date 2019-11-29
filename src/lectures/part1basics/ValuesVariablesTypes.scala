package lectures.part1basics

object ValuesVariablesTypes extends App {
 val x: Int = 42;
 println(x)

 //Compiler infers type
 val y = 42
 println(y)

 //val is immutable
 //y = 21

 val aString: String = "Hello"
 //semicolon are not necessary in Scala. Must be used only if multiple expressions in a single line.

 val aBoolean: Boolean = true

 val aChar: Char = 'a'

 val anInt: Int = y

 val aShortNumber: Short = 1234

 val aLongNumber: Long = 2123234151L

 val aFloat: Float = 3.14f

 val aDouble: Double = 3.14

 //variables
 var aVariable:Int = 4
 aVariable = 5
 // Functional programming requires the use of vals over vars!
}
