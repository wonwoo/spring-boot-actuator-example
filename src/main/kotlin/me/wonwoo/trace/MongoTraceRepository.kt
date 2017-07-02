package me.wonwoo.trace

import org.springframework.boot.actuate.trace.Trace
import org.springframework.boot.actuate.trace.TraceRepository
import org.springframework.data.mongodb.core.MongoOperations
import java.util.*

/**
 * Created by wonwoolee on 2017. 7. 2..
 */
class MongoTraceRepository(val mongoOperations: MongoOperations) : TraceRepository {

  override fun add(traceInfo: Map<String, Any>?) {
    mongoOperations.save(Trace(Date(), traceInfo))
  }

  override fun findAll(): List<Trace> {
    return mongoOperations.findAll(Trace::class.java)
  }
}