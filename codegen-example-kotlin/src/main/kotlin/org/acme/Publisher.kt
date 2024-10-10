package org.acme

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null
    @OneToMany(mappedBy = Book_.PUBLISHER, cascade = [CascadeType.PERSIST])
    val books: MutableList<Book> = mutableListOf()
}