package org.productshop.domain.models.view;

import org.productshop.domain.models.service.CategoryServiceModel;

import java.math.BigDecimal;
import java.util.List;

public class ProductDetailsViewModel {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public ProductDetailsViewModel() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
