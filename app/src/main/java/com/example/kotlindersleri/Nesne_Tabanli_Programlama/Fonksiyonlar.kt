package com.example.kotlindersleri.Nesne_Tabanli_Programlama

class Fonksiyonlar {
    // void geri dönüş değeri olmayan
    fun selamla1(){            // void de sadce fonksiyon çalışacak
        val sonuc = "merhaba ahmet"
        println(sonuc)
    }
    fun geriDonusOlmayan(){
        val a= "merthabaaa"
        println(a)
    }

    // geri dönüş değeri olan
    fun selamla2(): String{
        val sonuc = "merhaba ahmet"
        return sonuc
    }
    fun geridonusOlan (): String{
        val b = "selam"
        return b
    }

    //parametre
    fun selamlasma3(isim:String){
        val sonuc = "merhaba ${isim}"
        println(sonuc)

    }

    fun toplama1(sayi1:Int,sayi2:Int):Int {
       val  toplam  = sayi1 + sayi2
        return toplam
    }

    //Overloading : aynı isimde fonksiyonu kabul etmez tek şartı parametre içinde yer alan veri türleri farklı olmalı
    fun carp(sayi1:Double,sayi2:Int){
        println(sayi1*sayi2)
    }
    fun carp(sayi1:Int,sayi2:Int){
        println(sayi1*sayi2)
    }




}