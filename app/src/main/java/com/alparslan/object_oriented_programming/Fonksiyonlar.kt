package com.alparslan.object_oriented_programming

fun main(){

    fun selamla(){
        val sonuc = "Merhaba Alparslan"
        println(sonuc)
    }

    selamla()
///////////////////////////////////////
    fun selamlaDon():String{
        val sonuc = "Merhaba Kılıç"
        return sonuc
    }

    val gelensonuc= selamlaDon()
    println(gelensonuc)
////////////////////////////////////////

    fun selamla2(isim:String){
        val sonuc= "Merhaba $isim"
        println(sonuc)
    }
    selamla2(" Merhaba Ülkü")
//////////////////////////////////////// Dönüşsüz

    fun toplama(){
        val toplam = 30+40
        println("Toplama: $toplam")
    }
    toplama()
//////////////////////////////////////// Dönüşlü
    fun toplama1():Int{
        val toplam = 40+40
        return toplam
    }
    val top1= toplama1()
    println("top1: $top1")





}