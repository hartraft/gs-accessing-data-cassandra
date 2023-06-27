package com.example.accessingdatacassandra

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.*
import java.util.function.Consumer

@SpringBootApplication
open class AccessingDataCassandraApplication {
    @Autowired
    lateinit var fakerService: FakerService
    @Bean
    open fun clr(vetRepository: VetRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            vetRepository.deleteAll()
            fakerService.init()
            vetRepository.findAll()
                    .forEach(Consumer { v: Vet -> println("Vet: ${v.firstName} ${v.lastName}: ${v.specialties.joinToString()}") })
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(AccessingDataCassandraApplication::class.java)
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(AccessingDataCassandraApplication::class.java, *args)
        }
    }
}