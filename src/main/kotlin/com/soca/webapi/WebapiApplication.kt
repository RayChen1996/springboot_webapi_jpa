package com.soca.webapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication

class WebapiApplication

fun main(args: Array<String>) {
	runApplication<WebapiApplication>(*args)
}
