package org.productshop.domain.models.service;

public class CategoryServiceModel extends BaseServiceModel {
    private String name;

    public CategoryServiceModel() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
