package com.example.kotlindersleri.Nesne_Tabanli_Programlama

fun main() {
    val sonuc =5.carpi(4)
    println(sonuc)

    val sonuc2= 5 carpi2 4 // infix ile mesela dongüde down to kullanımı gibi yazabiliriz yani
    // 5 carpi 4 gibi
}

fun Int.carpi(sayi:Int):Int{ //Int classına carpi adında fonk oluşturuldu
    return this * sayi // this= Int sınıfı
}

infix fun Int.carpi2(sayi2:Int):Int{
    return this * sayi2
}