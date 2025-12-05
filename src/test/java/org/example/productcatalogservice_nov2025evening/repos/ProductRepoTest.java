package org.example.productcatalogservice_nov2025evening.repos;

import jakarta.transaction.Transactional;
import org.example.productcatalogservice_nov2025evening.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;

    @Test
    @Transactional
    public void testJpaMethods() {
        System.out.println(productRepo.getMeNameOfProductWhosePriceIs(60000D));
    }
}