package com.ivoyant.learncosmosdb.model;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@Document(collection = "Customer")
public class Customer {
    @Id
    @PartitionKey
    private String id;
    private String name;
    private String email;
    private Address address;
}
