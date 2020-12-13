package com.shiccah.telegram.bot.configuration

import com.shiccah.telegram.bot.TestBot
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.bots.DefaultBotOptions

@Configuration
class AppConfig(private val property: BotConfigurationProperty) {

    @Bean
    fun testBot(): TestBot {
        return TestBot(property)
    }
}
