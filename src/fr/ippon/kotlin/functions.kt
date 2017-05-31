package fr.ippon.kotlin

/**
 * Created by Quentin on 31/05/2017.
 */

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    println("###############")
    println("sum(1, 2) = " + sum(1, 2))
    printSum(3, 4)
    println("###############")
}