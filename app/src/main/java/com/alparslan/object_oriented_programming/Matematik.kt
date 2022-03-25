package com.alparslan.object_oriented_programming

import java.util.function.DoubleBinaryOperator

class Matematik {

    fun topla(sayi1:Int,sayi2:Int){

        val toplam = sayi1 + sayi2
        println("Toplam: $toplam")
    }

    fun cikar(sayi1:Double, sayi2:Double):Double{
        return sayi1 - sayi2
    }

    fun carp(sayi1:Int, sayi2:Int,isim:String){
        val sonuc = sayi1*sayi2
        println("Çarpma yapan $isim Sonuç: $sonuc")
    }

    fun bolme(sayi1:Double, sayi2:Double):String{
        return "Bölme: ${sayi1/sayi2}"
    }

}