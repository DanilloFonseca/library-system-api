package com.fonseca.library_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "books")
@Entity(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String book_name;
    private String author_name;
    private Long number_of_pages;
    private String book_genre;
    private Boolean status_borrowed;
    private Long book_edition;
    private Long book_year;
}
