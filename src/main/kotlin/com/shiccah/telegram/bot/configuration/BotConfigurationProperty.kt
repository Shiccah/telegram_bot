package com.shiccah.telegram.bot.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.DefaultBotOptions

@Component
@ConfigurationProperties(prefix = "telegrambot")
class BotConfigurationProperty {
    var webHookPath: String? = null
    var userName: String? = null
    var botToken: String? = null
    var proxyType: DefaultBotOptions.ProxyType? = null
    var proxyHost: String? = null
    var proxyPort = 0
}