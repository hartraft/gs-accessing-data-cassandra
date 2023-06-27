package com.example.accessingdatacassandra

import org.springframework.data.repository.CrudRepository
import java.util.*

interface VetRepository : CrudRepository<Vet, UUID> {
    fun findByFirstName(username: String?): Vet?
}