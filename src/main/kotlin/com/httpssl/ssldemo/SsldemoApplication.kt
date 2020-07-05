package com.httpssl.ssldemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SsldemoApplication

fun main(args: Array<String>) {
	runApplication<SsldemoApplication>(*args)
}
