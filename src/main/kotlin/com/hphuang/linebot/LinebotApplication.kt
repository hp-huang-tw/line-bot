package com.hphuang.linebot

import com.linecorp.bot.model.event.Event
import com.linecorp.bot.model.event.MessageEvent
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@LineMessageHandler
class LinebotApplication {

    @EventMapping
    fun handleTextMessageEvent (messageEvent: MessageEvent<TextMessageContent>): TextMessage {
        val text = messageEvent.message.text
        return TextMessage(text)
    }

    @EventMapping
    fun handleDefaultMessageEvent(event: Event) {
        println("handleDefaultMessageEvent")
    }
}

fun main(args: Array<String>) {
    runApplication<LinebotApplication>(*args)
}
