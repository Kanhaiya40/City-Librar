package com.example.library.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Books {

    @Id
    @GeneratedValue
    @JsonProperty("Book Id")
    private int bookId;
    @JsonProperty("Book Name")
    private String bookName;
    @JsonProperty("Book Author")
    private String bookAuthor;
    @JsonProperty("Year Of Publish")
    private String yearOfPublish;
    @JsonProperty("Book Price")
    private float price;
    @JsonProperty("Book Status")
    private String status;
    @JsonProperty("Book Publisher")
    @OneToOne(cascade = CascadeType.ALL)
    private Publisher publisher;
}
