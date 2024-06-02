package com.example.kotlindersleri.Nesne_Tabanli_Programlama

fun main() {
    // nullable - null safety - Optional(Swift)
    var x = " merhaba  "

    //tanımlama kısmı
    var str :String? = null

    str = "merhaba"

    //Yöntem1
    println("yöntem1: ${str?.trim()}") //trim(): önünde ve arkasında bnulunan boşlukları siler


    //Yöntem2
   // println("yöntem2: ${str!!.trim()}") // !!: anlamı ben koduma güveniyorum null olmayacak aksi takdirde uygulama çöker


    //Yöntem3
    if(str!= null){
        println("Yöntem3: ${str.trim()}")
    }
    else{
        println("sonuç null dur" )
    }

    //Yöntem4
    str?.let {
       println("yöntem4: ${str.trim()}") // str yerine it yazabirirsin
    }

}