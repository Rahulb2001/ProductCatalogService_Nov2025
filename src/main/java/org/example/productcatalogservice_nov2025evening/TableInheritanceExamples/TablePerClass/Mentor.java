package org.example.productcatalogservice_nov2025evening.TableInheritanceExamples.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="tpc_mentor")
public class Mentor extends User {
    private Double ratings;
}
