package mk.ukim.finki.emt.productcatalog.domain.models;

import jakarta.persistence.*;

import mk.ukim.finki.emt.productcatalog.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name = "product")
public class Product extends AbstractEntity<ProductId> {

    private String productName;
    private Quantity quantity;
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @AttributeOverrides({
            @AttributeOverride(name = "amount",
            column = @Column(name = "price_amount")),
            @AttributeOverride(name = "currency",
                    column = @Column(name = "price_currency"))
    })
    private Money price;
    private String description;
}
