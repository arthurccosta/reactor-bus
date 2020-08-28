package br.com.study.reactorbus.consumer

import br.com.study.reactorbus.model.NotificationData
import br.com.study.reactorbus.service.NotificationService
import org.springframework.stereotype.Service
import reactor.bus.Event
import reactor.fn.Consumer
import java.lang.Exception

@Service
class NotificationConsumer(val notificationService: NotificationService) : Consumer<Event<NotificationData>> {

    override fun accept(notificationDataEvent: Event<NotificationData>) {
        val notificationData = notificationDataEvent.data

        try {
            notificationService.initiateNotification(notificationData)
        } catch (ex: Exception) {
            TODO("Not yet implemented")
        }
    }
}