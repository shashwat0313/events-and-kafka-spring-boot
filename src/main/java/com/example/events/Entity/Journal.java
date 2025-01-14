package com.example.events.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int journal_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_user_id", referencedColumnName = "user_id")
    User author;

    String message;
}
