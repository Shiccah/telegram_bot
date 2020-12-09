package main.kotlin

import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession


fun main(args: Array<String>) {
    val telegramBotsApi = TelegramBotsApi(DefaultBotSession::class.java)
    telegramBotsApi.registerBot(TestBot())
}
