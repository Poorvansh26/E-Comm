package com.poorvansh.E_Comm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Entity
public class Product {

    @Id
    public int prodID;

    private String prodName;
    private int price;

    public Product(){
    }

}
