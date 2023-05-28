package mk.ukim.finki.emt.customer.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "customers")
public class Customer  extends AbstractEntity<CustomerId> {

    private String name;
    private String username;
    private String email;
    private String password;
}
