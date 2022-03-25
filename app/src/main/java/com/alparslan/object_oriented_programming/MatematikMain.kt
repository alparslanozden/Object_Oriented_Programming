package com.alparslan.object_oriented_programming

fun main(){

    val m = Matematik()

    m.topla(100, sayi2 = 200)

    val c = m.cikar(sayi1 = 200.0, sayi2 = 100.1 )
    println("Sonuç: $c")

    m.carp(sayi1 = 2, sayi2 = 5, isim = "Alparslan")

}
