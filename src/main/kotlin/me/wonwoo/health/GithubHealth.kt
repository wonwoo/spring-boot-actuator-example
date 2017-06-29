package me.wonwoo.health

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 * Created by wonwoolee on 2017. 6. 29..
 */
@Component
class GithubHealth : HealthIndicator {
  override fun health(): Health {
    val restTemplate = RestTemplate()
    try {
      val response = restTemplate.getForEntity("https://api.github.com", String::class.java);
      return Health.up().withDetail("statusCode", response.statusCode.value()).build()
    } catch (e: Exception) {
      return Health.down().build()
    }
  }
}