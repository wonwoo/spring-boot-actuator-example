package me.wonwoo.health

import org.springframework.boot.actuate.health.AbstractHealthIndicator
import org.springframework.boot.actuate.health.Health
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 * Created by wonwoolee on 2017. 6. 29..
 */

@Component
class GithubHealth2 : AbstractHealthIndicator() {
  override fun doHealthCheck(builder: Health.Builder?) {
    val restTemplate = RestTemplate()
    val response = restTemplate.getForEntity("https://api.github.com", String::class.java);
    builder?.up()?.withDetail("statusCode", response.statusCode.value())
  }
}