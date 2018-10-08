package com.batyrmalik.spring.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler

@SpringBootApplication
class AnnotationConfigurationApplication

fun main(args: Array<String>) {
    SpringApplication.run(AnnotationConfigurationApplication::class.java, *args)
}
