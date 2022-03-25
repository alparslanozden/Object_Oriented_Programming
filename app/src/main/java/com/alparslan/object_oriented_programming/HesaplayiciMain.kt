package com.alparslan.object_oriented_programming

fun main(){
    val h = HesaplayiciOverloading()  // AYNI METODU AYNI DEĞİŞKENLER VE İSİMLE FARKLI PARAMETRELERLE KULLANABİLİRİZ


    h.topla(sayi1 = 100, sayi2 = 50)
    h.topla(sayi1 = 500.0, sayi2 = 2)
    h.topla(sayi1 = 10, sayi2 = 5.0)
    h.topla(sayi1 = 5, sayi2 = 6, ad = "Alparslan")

}