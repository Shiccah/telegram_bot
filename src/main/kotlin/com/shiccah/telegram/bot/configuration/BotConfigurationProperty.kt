package com.shiccah.telegram.bot.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "telegrambot")
class BotConfigurationProperty {
    var webHookPath: String? = null
    var userName: String? = null
    var botToken: String? = null
}