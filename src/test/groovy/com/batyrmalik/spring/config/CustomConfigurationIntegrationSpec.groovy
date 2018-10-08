package com.batyrmalik.spring.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE

@SpringBootTest(webEnvironment = NONE)
class CustomConfigurationIntegrationSpec extends Specification {

    @Autowired
    CustomConfiguration customConfiguration

    def 'The configuration file is properly read'() {
        given: 'test key'
        customConfiguration.testKey

        when: 'dummy when'
        1 == 1

        then: 'configuration is properly read'
        customConfiguration.testKey == "6324234"
    }


}
