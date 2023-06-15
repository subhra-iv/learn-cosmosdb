package com.ivoyant.learncosmosdb.model;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@Container(containerName = "Customer")
public class Customer {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String email;
    private Address address;
}
