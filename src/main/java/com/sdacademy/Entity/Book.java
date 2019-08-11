package com.sdacademy.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue
   private int id;
   private String title;
    @ManyToOne
    private Category category;
    @ManyToMany
    private Set<Author> authors;
}
