package br.com.study.reactorbus.controller

import br.com.study.reactorbus.model.NotificationData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.bus.Event
import reactor.bus.EventBus

@RestController
class NotificationController(val eventBus: EventBus) {

    @GetMapping("startNotification/{param}")
    fun startNotification(@PathVariable param: Int) {
        for (i in 1..param) {
            val data = NotificationData(i.toLong(), "name", "email", "mobile")
            eventBus.notify("notificationConsumer", Event.wrap(data))

            println("Notification $i: notification task submitted successfully")
        }
    }
}