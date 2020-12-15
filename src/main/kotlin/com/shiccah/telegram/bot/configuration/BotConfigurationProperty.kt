package com.shiccah.telegram.bot.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "telegrambot")
class BotConfigurationProperty {
    lateinit var webHookPath: String
    lateinit var userName: String
    lateinit var botToken: String
}