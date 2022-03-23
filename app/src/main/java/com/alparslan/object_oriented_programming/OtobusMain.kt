package com.alparslan.object_oriented_programming

fun main(){

    val kamilKoc = Otobus(kapasite = 50, nereden = "Bursa","Ankara", mevcutYolcu = 10 )
    val metro = Otobus(kapasite = 60, nereden = "Ankara","İstanbul", mevcutYolcu = 40 )

    kamilKoc.yazdır()
    metro.yazdır()

    kamilKoc.yolcuAl(10)
    metro.yolcuIndir(10)

    kamilKoc.yazdır()
    metro.yazdır()
}