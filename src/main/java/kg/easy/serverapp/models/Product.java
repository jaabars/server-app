package kg.easy.serverapp.models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Category category;
}
