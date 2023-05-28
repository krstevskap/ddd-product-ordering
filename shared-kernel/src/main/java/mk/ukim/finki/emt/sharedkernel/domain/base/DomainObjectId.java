package mk.ukim.finki.emt.sharedkernel.domain.base;

import lombok.Getter;

import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Embeddable
@Getter
public class DomainObjectId implements Serializable {

    private String id;
}
