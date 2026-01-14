package org.example.productcatalogservice_nov2025evening.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SortParam {
    private String paramName;
    private SortOrder sortOrder;
}
