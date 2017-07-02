package me.wonwoo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootActuatorExampleApplication {
//  @Bean
//  fun traceRepository(mongoOperations: MongoOperations) = MongoTraceRepository(mongoOperations)

//  @Bean
//  fun traceRepository(): TraceRepository {
//    val traceRepository = InMemoryTraceRepository()
//    traceRepository.setCapacity(1000)
//    return traceRepository;
//  }

//  @Bean
//  fun redisTemplate(
//      redisConnectionFactory: RedisConnectionFactory): RedisTemplate<String, Trace> {
//    val template = RedisTemplate<String, Trace>()
//    template.connectionFactory = redisConnectionFactory
//    val jackson2JsonRedisSerializer = Jackson2JsonRedisSerializer<Trace>(Trace::class.java)
//    val objectMapper = ObjectMapper()
//    val simpleModule = SimpleModule()
//    simpleModule.addKeyDeserializer(Trace::class.java, TraceDeserializer(objectMapper))
//    jackson2JsonRedisSerializer.setObjectMapper(objectMapper)
//    template.valueSerializer = jackson2JsonRedisSerializer
//    return template
//  }
}

fun main(args: Array<String>) {
  SpringApplication.run(SpringBootActuatorExampleApplication::class.java, *args)
}
