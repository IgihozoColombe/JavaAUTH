package rw.ac.rca.ne.cedric.server.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "quantity")
public class Quantity {

    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private int quantity;
    private String operation;
    private Date date;
}
