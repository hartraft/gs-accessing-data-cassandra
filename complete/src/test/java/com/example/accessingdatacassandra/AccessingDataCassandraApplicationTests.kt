package com.example.accessingdatacassandra

import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
@SpringBootTest
internal class AccessingDataCassandraApplicationTests {

    @MockBean
    private lateinit var fakerService: FakerService

    @Test
    fun contextLoads() {
    }
}