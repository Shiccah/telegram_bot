package com.shiccah.telegram.bot

import com.shiccah.telegram.bot.configuration.BotConfigurationProperty
import org.telegram.telegrambots.bots.TelegramWebhookBot
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class TestBot(property: BotConfigurationProperty) : TelegramWebhookBot() {
    private val TOKEN: String = property.botToken
    private val USERNAME: String = property.userName
    private var BOT_PATH: String = property.webHookPath

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