package com.alparslan.object_oriented_programming

fun main (){

    fun Int.carpi(sayi:Int):Int{  // VAR OLAN SINIFLARI GENİŞLETMEK
        return this * sayi
    }


    val sonuc = 5.carpi(2)
    println(sonuc)

    //// Başına infix yazarsak

    infix fun Int.carpi2(sayi:Int):Int{
        return this * sayi
    }
    val sonuc2 = 5 carpi2 5
    println(sonuc)
}
