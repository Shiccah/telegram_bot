package com.shiccah.telegram.bot

import org.telegram.telegrambots.bots.TelegramWebhookBot
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class TestBot : TelegramWebhookBot() {
    private val TOKEN: String = ""
    private val USERNAME: String = ""
    private var BOT_PATH: String = "https://e2a696db7933.ngrok.io"

    override fun getBotToken(): String {
        return TOKEN
    }

    override fun getBotUsername(): String {
        return USERNAME
    }

    override fun onWebhookUpdateReceived(update: Update): BotApiMethod<*> {
        return SendMessage().apply {
            chatId = update.message.chatId!!.toString()
            text = "Hi ${update.message?.text ?: "Empty"}"
        }
    }

    override fun getBotPath(): String {
        return BOT_PATH
    }
}