package org.example.productcatalogservice_nov2025evening.services;

import org.example.productcatalogservice_nov2025evening.dtos.SortParam;
import org.example.productcatalogservice_nov2025evening.models.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ISearchService {

    Page<Product> searchProducts(String query, Integer pageSize, Integer pageNumber, List<SortParam> sortParamList);
}
