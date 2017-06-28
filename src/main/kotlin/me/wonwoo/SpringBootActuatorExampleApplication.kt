package me.wonwoo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootActuatorExampleApplication

fun main(args: Array<String>) {
  SpringApplication.run(SpringBootActuatorExampleApplication::class.java, *args)
}
