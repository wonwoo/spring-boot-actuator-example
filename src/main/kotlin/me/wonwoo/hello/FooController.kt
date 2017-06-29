package me.wonwoo.hello

import org.springframework.boot.actuate.metrics.GaugeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wonwoolee on 2017. 6. 29..
 */

@RestController
class FooController(val gaugeService: GaugeService) {

  @GetMapping("/submit")
  fun submit(): String {
    val startTime = System.currentTimeMillis();
    Thread.sleep(100)
    gaugeService.submit("hello.foo.bar", (System.currentTimeMillis() - startTime).toDouble())
    return "submit"
  }
}