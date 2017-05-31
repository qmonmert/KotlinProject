package fr.ippon.kotlin

/**
 * Created by Quentin on 31/05/2017.
 */

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2
    val c: Int = 3
    println("a is $a")

    // Comments
    /* Comments
       comments ...
     */

    val sports = listOf<String>("swim", "bike", "run")
    for (sport in sports) {
        println("sport : $sport")
    }

    for (x in 1..5) {
        println(x)
    }

    sports
        .filter { it.startsWith("r") }
        .map { it.toUpperCase() }
        .forEach { println("sport filtered : $it") }
}