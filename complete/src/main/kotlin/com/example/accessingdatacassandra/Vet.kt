package com.example.accessingdatacassandra

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

@Table
class Vet(@field:PrimaryKey var id: UUID,
          var firstName: String,
          var lastName: String,
          var specialties: Set<String>)