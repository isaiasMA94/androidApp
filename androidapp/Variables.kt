package com.GamerUp.androidapp

/* variables
instancias valor no se puede modificar
instancias variables se peude modificar
 */
val age: Int = 30//valor funcion de clase que todas las funciones pueden utilizar

fun main() {
    showMyName()//funciones vacias
    showMyAge()//funciones con parametros de entreda
    add(29, 30)
    val mySubtract = subtract(10, 5)//funciones con parametros de salida
    println(mySubtract)
}

fun showMyName() {
    println("me llamo Isaias")
}

fun showMyAge(currentAge: Int = 31) {
    println("tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)

}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber

}
fun subtractCool(firstNumber: Int, secondNumber: Int)= firstNumber - secondNumber//funcion comprimida para funciones pequeñas




fun variablesNumericas() {

    //int

    var age2: Int = 30
    age2 = 29

    //long
    val example: Long = 3049
    val example2: Long = 30
    //float
    val floatExample: Float = 30.4f


    println("sumar")
    println(age + age2)

    println("restar")
    println(age - age2)

    println("multiplicar")
    println(age * age2)

    println("dividir")
    println(age / age2)

    println("modulo")//el resto
    println(age % age2)


    //double
    val doubleExample: Double = 32.9889

    //println(age + example)
    var exampleSuma = age + floatExample.toInt()

}

fun variableAlfanumericas() {

    //char
    val charExample1: Char = 'a'
    val charExample2: Char = 'b'

    //String
    val stringExample: String = "Isaias"
    val stringExample0 = "Gamers"
    val stringExample2: String = "34"
    val stringExample3 = "23"


//println de una variable string concatenada
    var StringConcatenada: String = "hola"
    StringConcatenada = "hola me llamo $stringExample y tengo $age años"
    println(StringConcatenada)

    //se transforma la variable con ,toString .toInt y la variable se tranforma al tipo de variable
    val expample3: String = age.toString()



    println(stringExample + stringExample3)
    println(stringExample.toInt() + stringExample3.toInt())

}

fun variablesBoleanas() {

    //bolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false

    println(booleanExample2)
}


