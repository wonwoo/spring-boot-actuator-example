package me.wonwoo.trace

import org.springframework.boot.actuate.trace.Trace
import org.springframework.boot.actuate.trace.TraceRepository
import org.springframework.data.redis.core.RedisTemplate
import java.util.*

/**
 * Created by wonwoolee on 2017. 7. 2..
 */
class RedisTraceRepository(val redisTemplate: RedisTemplate<String, Trace>) : TraceRepository {

  override fun add(traceInfo: Map<String, Any>?) {

    redisTemplate.opsForList().rightPush("redisTrace", Trace(Date(), traceInfo))
  }

  override fun findAll(): List<Trace> {
    return redisTemplate.opsForList().range("redisTrace", 0, 100)
  }
}

