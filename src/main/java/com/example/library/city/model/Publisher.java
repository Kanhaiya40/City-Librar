package com.example.library.city.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private int id;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Mobile No.")
    private String phoneNo;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Books> books;
}
