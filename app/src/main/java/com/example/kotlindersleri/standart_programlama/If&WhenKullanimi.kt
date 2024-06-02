package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19
    val isim = "Ahmet"


    if(yas>=18){
        println("reşitsiniz")
    }
    else{
        println("reşit değilsiniz")
    }

    if(isim=="Ahmet"){
        println("Merhaba Ahmet")
    }
    else if(isim== "Mehmet"){
        println("mehaba Mehmet")
    }

    else
    {
        println("tanınmayan kişi")
    }


    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456){
        println("hoşgeldiniz")
    }
    else{
        println("haatlı giriş")
    }

    val sayi = 20
    if(sayi == 10 || sayi == 20){
        println("sayı 10 veya 20 dir")
    }
    else{
        println("sayı 10 veya 20 değildir" )
    }

   // When - Switch
   val gun = 3

   when(gun){
       1 -> println("pazartesi")
       2 -> println("salı")
       3 -> println("çaramaba")
       4 -> println("perşembe")
       5 -> println("cuma")
       6 -> println("cumartesi")
       7 -> println("pazar")
       else -> println("böyle bir gün yok")

   }


















}