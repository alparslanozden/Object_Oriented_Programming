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


    fun faktoriyel(sayi:Int):Int{
        var sonuc = 1
        for (i in 1..sayi){
            sonuc = sonuc * i
        }
        return sonuc
    }


    fun kelimeAdeti(kelime:String, harf:Char){
        var sonuc= 0

        for (k in kelime){
            if(k == harf){
                sonuc = sonuc + 1
            }
        }
        println("Harf Adeti: $sonuc")
    }

    fun icAciToplama(kenarsayisi:Int):Int{
        val toplam = (kenarsayisi-2)*180
        return toplam
    }

    fun maasHesaplama(gunSayisi:Int):Int{
            val calismaSaati = gunSayisi * 8
        println("Çalışma saati: $calismaSaati")
            var maas = 0
        if(calismaSaati > 160){
        val mesaiFazlasi = calismaSaati - 160
        maas = 160 * 10 + mesaiFazlasi * 20
    }else{
        maas = calismaSaati * 10
    }
        return maas
    }


    fun internetUcretiHesaplama(gb:Int):Int{
        var ucret = 0
    if(gb > 50){
        val kotaFazlasi = gb - 50
        ucret = 100 + kotaFazlasi
    }else{
        ucret = 100
    }
    return ucret
    }




}