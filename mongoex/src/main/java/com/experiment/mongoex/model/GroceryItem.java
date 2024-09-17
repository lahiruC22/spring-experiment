package com.experiment.mongoex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document("groceryitems")
@AllArgsConstructor
@Getter
@Setter
public class GroceryItem {
    @Id
    private String id; //Primary key in the document

    private String name;
    private int quantity;
    private String category;
}
