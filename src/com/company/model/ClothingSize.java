package com.company.model;

public enum ClothingSize {
    S("Small"), M("Medium"), L("Large");
    private String description;

    ClothingSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
