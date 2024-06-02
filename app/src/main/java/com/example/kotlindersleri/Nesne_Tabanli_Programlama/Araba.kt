package com.example.kotlindersleri.Nesne_Tabanli_Programlama

class Araba(var renk:String , var hiz:Int , var calisiyorMu:Boolean) {

    init {
        println("******** Constructor çalıştı *********")
    }

   fun calisitir(){   // side effect : fonksiyon ile sınıfın özelliklerini değiştirme
       calisiyorMu = true
       hiz= 5
   }

    fun durdur(){
        calisiyorMu = false
        hiz=0
    }
    fun hizlan(kacKm : Int){
        hiz +=kacKm
    }
    fun yavasla(kacKm: Int){
        hiz-=kacKm
    }

    fun bilgiAl(){
        println("--------------------------------------------------------------")
        println("renk: ${renk}")
        println("hızı: ${hiz}")
        println("çalışıyor mu : ${calisiyorMu}")
    }

    // this veya self(switch) : bulunduğunuz sınıfı
    // super : kalıtım varsa üst sınıfı temsil eder
}