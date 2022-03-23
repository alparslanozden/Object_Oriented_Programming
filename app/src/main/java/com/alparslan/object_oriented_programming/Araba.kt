package com.alparslan.object_oriented_programming

class Araba (var renk:String,var hiz:Int,var calisiyorMu:Boolean) {


    fun calistir(){
        calisiyorMu = true
    }

    fun durdur(){
        calisiyorMu = false
    }

    fun hizlan(kacKm:Int){
    hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int){
        hiz = hiz - kacKm
    }

    fun bilgiAl(){
        println("--------------------------")
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor mu: $calisiyorMu")
    }



}