package com.alparslan.object_oriented_programming

class HesaplayiciOverloading {

    fun topla(sayi1:Int,sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Double,sayi2:Int){
        println("Toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Double){
        println("Toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2:Int,ad:String){
        println("Toplama yapan $ad,toplam: ${sayi1+sayi2}")
    }

}