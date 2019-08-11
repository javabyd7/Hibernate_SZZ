package com.sdacademy.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue
    int id;
    String name;
    @OneToMany(mappedBy = "category")
    private Set<Book> bookSet;

}
