package com.shiccah.telegram.bot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TelegramBotApplication

fun main(args: Array<String>) {
	runApplication<TelegramBotApplication>(*args)

	// TODO add
	//  val telegramBotsApi = TelegramBotsApi(DefaultBotSession::class.java)
	//  telegramBotsApi.registerBot(TestBot())
}
