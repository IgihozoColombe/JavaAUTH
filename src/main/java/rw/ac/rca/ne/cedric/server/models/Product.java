package rw.ac.rca.ne.cedric.server.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private int code;
    private String name;
    private String productType;
    private double price;
    private Date inDate;
    private String image;

}
