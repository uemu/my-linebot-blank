package uemu.xxxbot

import com.linecorp.bot.model.event.Event
import com.linecorp.bot.model.event.MessageEvent
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@LineMessageHandler
class XxxbotApplication {

  @EventMapping
  fun handleTextMessageEvent(messageEvent: MessageEvent<TextMessageContent>): List<TextMessage> {
    val response = ArrayList<TextMessage>()
    response.add(TextMessage(messageEvent.message.text))
    return response
  }

  @EventMapping
  fun handleDefaultMessageEvent(event: Event) {
  }

}

fun main(args: Array<String>) {
  SpringApplication.run(XxxbotApplication::class.java, *args)
}
