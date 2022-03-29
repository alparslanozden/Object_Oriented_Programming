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
}