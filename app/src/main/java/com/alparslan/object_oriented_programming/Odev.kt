package com.alparslan.object_oriented_programming

import java.util.*

class Odev {

    fun derece() {
        var scanner = Scanner(System.`in`)
    println("Celcius değerini giriniz: ")
        var c = scanner.nextInt()
        var f = (c * 1.8) + 32
    println("Fahrenheit değeri: $f")
}

    fun cevreHesabi(){
        var scanner = Scanner(System.`in`)
    println("Dikdörtgenin uzun kenarını giriniz: ")
        var uzun = scanner.nextInt()
    println("Dikdörtgenin kısa kenarını giriniz: ")
        var kisa = scanner.nextInt()
        var cevre = kisa*uzun
        println("Dikdörtgenin çevresi: $cevre m2")
    }

    fun cevre(kisakenar:Int, uzunkenar:Int){
        val cevreHesabi = 2*kisakenar + 2*uzunkenar
        println("Dikdörtgen Çevresi: $cevreHesabi")
    }


    fun faktoriyel(){
        var scanner = Scanner(System.`in`)
    println("Faktöriyeli hesaplanacak sayıyı giriniz: ")
        var sayi = scanner.nextInt()
        for (i in 1..sayi){
            var sonuc= i*1
            i+1
            return
        }
    }


}