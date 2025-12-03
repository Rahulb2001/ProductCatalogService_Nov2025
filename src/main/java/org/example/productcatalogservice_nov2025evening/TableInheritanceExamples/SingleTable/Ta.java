package org.example.productcatalogservice_nov2025evening.TableInheritanceExamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="st_ta")
@DiscriminatorValue(value = "TA")
public class Ta extends User {
    private Integer helpRequests;
}
