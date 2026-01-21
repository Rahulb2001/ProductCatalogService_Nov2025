package org.example.productcatalogservice_nov2025evening.services;

import org.example.productcatalogservice_nov2025evening.dtos.SortParam;
import org.example.productcatalogservice_nov2025evening.models.Product;
import org.example.productcatalogservice_nov2025evening.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaSearchService implements ISearchService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Page<Product> searchProducts(String query,
                                        Integer pageSize,
                                        Integer pageNumber,
                                        List<SortParam> sortParamList) {
        Sort sort2 = Sort.by("description").descending();
        Sort sort = Sort.by("category").and(sort2);
        return productRepo.findByName(query, PageRequest.of(pageNumber,pageSize,sort));
    }
}

//[{"price","LOWTOHIGH"},{"id","HIGHTOLOW"},{"TITLE","LOWTOHIGH"},{},{},{}]