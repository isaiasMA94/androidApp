package com.GamerUp.androidapp

fun main() {



//condicionales IF ELSE
}
fun ifMultipleOr(){
    var pet= "dog or cat"
    var isHappy = true
    if(pet == "dog" || (pet == "cat" && isHappy)){
        println("es un perro o un gato")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("puedo beber")
    }
}


fun ifInt() {
    var age = 18

    if (age >= 18) {
        println("beber cerveza")
    } else {
        println("beber jugo")
    }

}
    fun ifboolean() {
        //var buttonPressed:Boolean = true  ejemplo de negacion
        //buttonPressed = !buttonPressed
        // sin nada == true
        // con ! al principio == false

        val soyFeliz: Boolean = false

        if (!soyFeliz) {
            println("estoy triste")
        }


    }

    fun ifAnidado() {
        val animal = "dog"

        if (animal == "dog") {
            println("es un perro")
        } else if (animal == "cat") {
            println("es un gato")
        } else if (animal == "bird") {
            println("es un pajaro")
        } else {
            println("no es uno de los animales esperados")
        }
    }


    fun ifBasico() {
        val name = "isaias"

        if (name == "isaias") {
            println("la variable name es isaias")
        } else {
            println("este no es isaias")
        }
    }
