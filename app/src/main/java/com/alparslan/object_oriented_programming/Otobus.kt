package com.alparslan.object_oriented_programming

class Otobus (var kapasite:Int, var nereden:String, var nereye:String, var mevcutYolcu:Int) {

fun yazdır(){
    println("--------------------------------")
    println("Yolcu Kapasitesi: $kapasite")
    println("Nereden: $nereden")
    println("Nereye: $nereye")
    println("Mevcut Yolcu: $mevcutYolcu")

}
    fun yolcuAl(yolcu:Int){
        mevcutYolcu = mevcutYolcu + yolcu
    }

    fun yolcuIndir(yolcu: Int){
        mevcutYolcu = mevcutYolcu - yolcu
    }


}