package org.acme;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    public Long id;

    @OneToMany(mappedBy = Book_.PUBLISHER, cascade = CascadeType.PERSIST)
    public Collection<Book> books;

    public Publisher() {
        books = new ArrayList<>();
    }


}
