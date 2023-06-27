package com.example.accessingdatacassandra

import net.datafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class FakerService {
    @Autowired
    lateinit var vetRepository: VetRepository
    fun init() {
        val faker = Faker()
        for (i in 0..100) {
            vetRepository.save(Vet(UUID.randomUUID(), faker.name().firstName(), faker.name().lastName(),
                    (0..(0..3).random()).map {(faker.job().field())}.toSet()))
        }
    }
}