package org.acme

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Book (
    var title: String,
    @ManyToOne(fetch = FetchType.LAZY)
    val publisher: Publisher? = null
) {
    constructor() : this(title = "", publisher = null)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null
}