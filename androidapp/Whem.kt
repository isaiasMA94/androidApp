package com.GamerUp.androidapp

fun main() {
    getSemester(2)
}

//when
fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) print("hola")

    }
}


fun getMonth(month: Int) {
    when (month) {
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("noviembre")//varios print en un mes enrte llaves
            println("noviembre")
        }

        12 -> println("diciembre")
        else -> print("no es un mes valido")
    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
        else -> println("no es un trimestre valido")
    }
}

fun getSemester(month: Int): String {
    val result = when (month) {
        //in 1.. 6 -> println("primer semestre")//se utilza in para los rango de valores
        //in 7..12 -> println("segundo semestre")
        //else -> println("semestre no valido")
        //!in 1..12 ->print("semestre no valido")  ejemplo de negacion


        /* in 1.. 6 -> return "primer semestre"//1..12 se utilza in para los rango de valores
         in 7..12 -> return "segundo semestre"  //se retorna un String
         !in 1..12 ->return "semestre no valido"
         else -> return "dam"*/

        in 1..6 -> "primer semestre"
        in 7..12 -> "segundo semestre"
        !in 1..12 -> "semestre no valido"
        else -> "semestre no valido"
    }
    return result
}
//se simplifica aun mas la funcion donde se retorna el semestre en menos lineas
/*fun getSemester(month: Int) = when (month){
in 1..6 -> "primer semestre"
in 7..12 -> "segundo semestre"
!in 1..12 -> "semestre no valido"
else -> "semestre no valido"
}
*/
