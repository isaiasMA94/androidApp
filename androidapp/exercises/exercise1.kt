package com.GamerUp.androidapp.exercises
/*EN EL CODIGO INICIAL UQE SE PROPORCIOMA EM EL SIGUIENTE FRAGMENTO DE CODIGO,
ESCRIBE UN PROGRAMA QUE IMPRIMA EL MENSAJE DE RESUMEN,
SEGUN LA CANTIDAD DE NOTIFICACIONES QUE RECIBISTE.
EL MENSAJE DEBE INCLUIR LO SIGUIENTE

-LA CANTIDAD EXACTA DE NOTIFICACIONES CUANDO HAYA MENOS DE 100
-99+ COMO CANTIDAD DE NOTIFICACIONES CUANDO HAYA  100  O MAS.

-YOU HAVE 51 NOTIFICATIONS.
-YOUR PHONE BLOWING UP! YOU HAVE 99+ NOTIFICATIONS.
 */

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSumary(morningNotification)
    printNotificationSumary(eveningNotification)
}
fun printNotificationSumary(numberOfMessage:Int){
    if(numberOfMessage >= 100){
        println("YOUR PHONE BLOWING UP! YOU HAVE 99+ NOTIFICATIONS.")
    }else{
        println("YOU HAVE $numberOfMessage")
    }
}