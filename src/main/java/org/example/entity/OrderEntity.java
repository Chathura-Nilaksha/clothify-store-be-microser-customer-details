package org.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderCode;
                //maximum nos of items can purchase is 15#
    private String item1Code;
    private Double item1UnitPrice;
    private Double item1SubTotal;

    private String item2Code;
    private Double item2UnitPrice;
    private Double item2SubTotal;

    private String item3Code;
    private Double item3UnitPrice;
    private Double item3SubTotal;

    private String item4Code;
    private Double item4UnitPrice;
    private Double item4SubTotal;

    private String item5Code;
    private Double item5UnitPrice;
    private Double item5SubTotal;

    private String item6Code;
    private Double item6UnitPrice;
    private Double item6SubTotal;

    private String item7Code;
    private Double item7UnitPrice;
    private Double item7SubTotal;

    private String item8Code;
    private Double item8UnitPrice;
    private Double item8SubTotal;

    private String item9Code;
    private Double item9UnitPrice;
    private Double item9SubTotal;

    private String item10Code;
    private Double item10unitPrice;
    private Double item10SubTotal;

    private String item11Code;
    private Double item11UnitPrice;
    private Double item11SubTotal;

    private String item12Code;
    private Double item12UnitPrice;
    private Double item12SubTotal;

    private String item13Code;
    private Double item13UnitPrice;
    private Double item13SubTotal;

    private String item14Code;
    private Double item14UnitPrice;
    private Double item14SubTotal;

    private String item15Code;
    private Double item15UnitPrice;
    private Double item15SubTotal;
}
