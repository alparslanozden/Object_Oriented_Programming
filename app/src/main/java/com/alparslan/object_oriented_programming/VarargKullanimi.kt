package com.alparslan.object_oriented_programming

fun main(){

    fun toplam(vararg sayilar:Int) : Int {   //İSTENİLDİĞİ KADAR VERİ GİRİLEBİLEN PARAMETRE

        var sonuc = 0

        for (s in sayilar ){
            sonuc = sonuc + s
        }
        return sonuc
    }


    val t1= toplam(1,2,3,4,5)
    println("t1: $t1")

}