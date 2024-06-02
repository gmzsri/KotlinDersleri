package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Gamze"
    var ogrenciSoyadi ="Sari"
    var ogrenciYas =23
    var ogrenciBoy  = 1.68
    var ogrenciBasharf = 'G'
    var ogrenciDevamEdiyormu = true

    println(ogrenciAdi)
    println(ogrenciSoyadi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyormu)


    var urun_id: Int = 3416
    var urun_adi :String = "Macbook pro"
    var urunAdeti : Int = 100
    var urunFiyat :Int =42999
    var urun_tedarikci :String = "apple"

    println("ürün id : $urun_id")
    println("ürün adı : $urun_adi")
    println("ürün adet sayısı : $urunAdeti")
    println("ürün fiyatı : $urunFiyat")
    println("ürün tedarikçisi : $urun_tedarikci")


    var a=10
    var b =20

    println("$a x $b : ${a*b}")


    // Sabitler - Constant (val keyword ile kullanılır)
    // val (kotlin )- let(swift) - final(java)
    var sayi = 30
    println(sayi) //30 çıktısını verir
    sayi = 100
    println(sayi) // 100 çıktısını verir


    val numara = 40 // bu değeri değitiremeyiz
    println(numara)

    // tür dönüşümü -Type Casting
    /*
    tür dönüşümü 3e ayrılır. bunlar ;
        - sayısaldan metine
        - sayısaldan sayısala
        -metinden sayısala
     */

    val i= 42
    val d = 78.95

    // sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    // sayısaldan metine dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    // metinden sayısala dönüşüm
    val yazi  = "67.54"

    val sonuc5 = yazi.toDouble()
    println(sonuc5)
}