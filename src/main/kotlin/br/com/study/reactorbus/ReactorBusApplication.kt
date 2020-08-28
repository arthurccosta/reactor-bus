package br.com.study.reactorbus

import br.com.study.reactorbus.consumer.NotificationConsumer
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import reactor.bus.EventBus
import reactor.bus.selector.Selectors.`$`

@SpringBootApplication
class ReactorBusApplication(val eventBus: EventBus,
							val consumer: NotificationConsumer) : CommandLineRunner {

	override fun run(vararg args: String) {
		eventBus.on(`$`("notificationConsumer"), consumer)
	}
}

fun main(args: Array<String>) {
	runApplication<ReactorBusApplication>(*args)
}
