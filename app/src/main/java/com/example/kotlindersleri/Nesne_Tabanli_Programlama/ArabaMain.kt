package com.example.kotlindersleri.Nesne_Tabanli_Programlama

fun main() {
    // Nesne Oluşturma
    val bmw = Araba("kırmızı", 0 , false)

   bmw.bilgiAl()
    bmw.calisitir()
    bmw.bilgiAl()
    bmw.yavasla(5)
    bmw.bilgiAl()

    val porsche = Araba("Siyah",150, true)
    porsche.bilgiAl()
    porsche.durdur()
    porsche.bilgiAl()
    porsche.hizlan(190)
    porsche.bilgiAl()

    val sahin = Araba("beyaz", 50,true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.hizlan(60)
    sahin.bilgiAl()
}