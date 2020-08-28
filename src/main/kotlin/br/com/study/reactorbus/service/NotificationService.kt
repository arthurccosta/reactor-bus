package br.com.study.reactorbus.service

import br.com.study.reactorbus.model.NotificationData

interface NotificationService {
    fun initiateNotification(notificationData: NotificationData)
}