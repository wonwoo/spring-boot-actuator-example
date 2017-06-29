package me.wonwoo.hello

import org.springframework.boot.actuate.metrics.CounterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wonwoolee on 2017. 6. 29..
 */

@RestController
class HelloController(val counterService: CounterService) {

  @GetMapping("/increment")
  fun increment(): String {
    counterService.increment("hello.foo.bar")
    return "hello";
  }

  @GetMapping("/decrement")
  fun decrement(): String {
    counterService.decrement("hello.foo.bar")
    return "hello";
  }

  @GetMapping("/reset")
  fun reset(): String {
    counterService.reset("hello.foo.bar")
    return "hello";
  }
}