package com.cis.batch33.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="book")
@Entity
@Data
public class LibraryBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Integer bookId;

    @Column(name="title")
    private String title;

    @Column(name="author_name")
    private String authorName;

    @Column(name="year_published")
    private String yearPublished;

    @Column(name="quantity")
    private Long quantity;
}