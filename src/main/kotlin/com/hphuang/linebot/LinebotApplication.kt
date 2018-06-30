package com.hphuang.linebot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LinebotApplication

fun main(args: Array<String>) {
    runApplication<LinebotApplication>(*args)
}
