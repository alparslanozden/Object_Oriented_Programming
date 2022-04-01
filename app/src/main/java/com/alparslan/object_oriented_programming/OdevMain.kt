package com.alparslan.object_oriented_programming

fun main(){

   /*

    var derece = Odev() //Celcius değerini Fahrenheite çeviren fonksiyon yazıp kullandık
    derece.derece()



    var dikdortgen = Odev() //Dikdörtgenin çevresini hesaplayan fonksiyon
    dikdortgen.cevreHesabi()

    */


    val o2 = Odev()
    o2.cevre(30,40)


    val o3 = Odev()
    val gelenVeri = o3.faktoriyel(5)
    println("Faktoriyel: $gelenVeri")


    val o4 = Odev()
    o4.kelimeAdeti("Ankara",'a')

}

