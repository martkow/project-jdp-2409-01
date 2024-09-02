package com.kodilla.ecommercee.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RequiredArgsConstructor
public class ProductDto {

    private final Long productId;
    private final String productName;
    private String description;
    private final BigDecimal price;
    private final int quantity;
    private final int productGroupId;
    private final LocalDate createDate;
}