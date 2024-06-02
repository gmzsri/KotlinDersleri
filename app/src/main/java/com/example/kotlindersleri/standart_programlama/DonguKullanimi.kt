package com.example.kotlindersleri.standart_programlama

fun main() {
   // 1,2,3
    for (i in 1..3) { //swift dilinde 1...3 (kotlinde iki nolta)
   println("döngü $i :$i")
    }

    // 10 ile 20 arasında 5er artsın
    for(a in 10..20 step 5){
        println("döngü : $a")
    }

    // 10 ile 20 arasında 5er azalsın
    for(b in 20 downTo 10 step 5){  // azaltarak olursa downTo ekle
        println("döngü : $b")
    }


    // 1,2,3,4,5
    var sayac = 1  // baslanğiç değerini veriyoruz

    while (sayac<6){
      println("döngü : $sayac")
      sayac+=1
    }

    // break ve continue koşul ifadelerinde kullanılır

    for (z in 1..5){
        if(z==3){
            continue  // döngüyü durdurmaz o adımı pas geçer
        }
        println("döngü 5: $z")
    }

    for (z in 1..5){
        if(z==3){
            break // döngüyü durdurur
        }
        println("döngü 6: $z")
    }



}