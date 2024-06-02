package com.example.kotlindersleri.Nesne_Tabanli_Programlama

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()

  val gelenSonuc = f.selamla2()
  println("gelen sonuc : ${gelenSonuc}")

    f.selamlasma3("gamze")

    val gelenToplam= f.toplama1(5,9)
    println(gelenToplam)

    f.carp(2,10)

f.geriDonusOlmayan()

    val selam = f.geridonusOlan()
    println(selam)

 f.carp(3,7)
    f.carp(4.9,7)


}
