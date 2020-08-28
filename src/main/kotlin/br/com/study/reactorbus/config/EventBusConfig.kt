package br.com.study.reactorbus.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import reactor.Environment
import reactor.bus.EventBus

@Configuration
class EventBusConfig {

    @Bean
    fun env(): Environment = Environment.initializeIfEmpty().assignErrorJournal()

    @Bean
    fun createEventBus(env: Environment) = EventBus.create(env, Environment.THREAD_POOL)

}