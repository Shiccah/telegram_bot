package main.kotlin

import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class TestBot : TelegramLongPollingBot() {
    private val TOKEN: String = ""
    private val USERNAME: String = ""

    override fun getBotToken(): String {
        return TOKEN
    }

    override fun getBotUsername(): String {
        return USERNAME
    }

    override fun onUpdateReceived(update: Update) {
        if (update.message == null || !update.message.hasText()) return

        val sendMessage = SendMessage().apply {
            chatId = update.message.chatId!!.toString()
            text = "Hi ${update.message.text}"
        }
        execute(sendMessage)
    }
}