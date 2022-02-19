package com.example.QuoteCRUD.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Quote_TBL")
public class Quote {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String desc;
    
}
