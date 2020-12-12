package com.shiccah.telegram.bot

import org.springframework.web.bind.annotation.*
import org.telegram.telegrambots.meta.api.methods.BotApiMethod
import org.telegram.telegrambots.meta.api.objects.Update

@RestController
class Controller(private val testBot: TestBot) {

    @PostMapping(value = ["/"])
    fun onUpdateReceived(@RequestBody update: Update): BotApiMethod<*>? {
        return testBot.onWebhookUpdateReceived(update)
    }
}