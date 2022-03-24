package ecommerce.app.e.packup.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class ProductModel implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Column
    private String name;


}
