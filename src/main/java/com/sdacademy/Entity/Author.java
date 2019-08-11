package com.sdacademy.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
public class Author {
     private String lastName;
     private String firstName;
     @Id
     @GeneratedValue
     private int Id;
     @ManyToMany(mappedBy = "authors")
     private Set<Book> bookSet;
}
