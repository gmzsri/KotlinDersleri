package com.example.kotlindersleri.Nesne_Tabanli_Programlama

class Odev2 {
    fun soru1(km:Double):Double{
        return km * 0.621
    }
    fun soru2(x:Int,y:Int){
        var alan = x * y
        println("sonuç2 : ${alan}")
    }
     fun soru3(kenarSayisi:Int):Int{
        var icAcilarToplami = ((kenarSayisi - 2)*180)/kenarSayisi
         return icAcilarToplami
     }

}