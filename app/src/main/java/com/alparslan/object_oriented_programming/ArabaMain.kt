package com.alparslan.object_oriented_programming

fun main(){

    val bmw = Araba(renk = "Kırmızı", hiz = 100, calisiyorMu = true)
    val sahin = Araba(renk = "Beyaz", hiz = 90, calisiyorMu = false)

    bmw.bilgiAl()
    bmw.durdur()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(20)
    bmw.bilgiAl()
    sahin.bilgiAl()

    /*
    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    bmw.renk = "Beyaz"
    bmw.hiz = 200
    bmw.calisiyorMu = true

    println("--------------------")
    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)
    */

}