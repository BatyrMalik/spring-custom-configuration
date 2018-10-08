package com.batyrmalik.spring.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Component
@ConfigurationProperties(prefix = "customconfigs")
@Validated
data class CustomConfiguration(
    var testKey: String = ""
)
