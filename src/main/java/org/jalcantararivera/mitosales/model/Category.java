package org.jalcantararivera.mitosales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
//@Table(schema = "tbl_category")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idCategory;

    //@Column(name="category_name",nullable = false,length = 50)
    @Column(nullable = false,length = 50)
    private String name;

    @Column(nullable = false,length = 50)
    private String description;

    @Column(nullable = false)
    private boolean enabled;

}

