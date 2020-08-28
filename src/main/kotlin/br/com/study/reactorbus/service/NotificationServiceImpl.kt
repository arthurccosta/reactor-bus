package br.com.study.reactorbus.service

import br.com.study.reactorbus.model.NotificationData
import org.springframework.stereotype.Service
import java.lang.Thread.sleep

@Service
class NotificationServiceImpl : NotificationService {

    override fun initiateNotification(notificationData: NotificationData) {
//        println("Notification service started for "
//                + "Notification ID: " + notificationData.id);
        sleep(10000)
        println("Notification service ended for Notification ID: " + notificationData.id)
    }
}