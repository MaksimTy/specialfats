package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product_recipe", schema = "tech")
public class ProductRecipe implements Serializable {

    @EmbeddedId
    private CompositeKeyRecipe compositeKeyRecipe;

    @Column(name = "product_recipe_describe")
    private String describe;

    @ManyToOne
    @JoinColumn(
            name = "product_recipe_product_line",
            nullable = false,
            referencedColumnName = "product_line_id",
            insertable = false,
            updatable = false)
    private ProductLine productLine;

    public ProductRecipe() {
    }

    public CompositeKeyRecipe getCompositeKeyRecipe() {
        return compositeKeyRecipe;
    }

    public void setCompositeKeyRecipe(CompositeKeyRecipe compositeKeyRecipe) {
        this.compositeKeyRecipe = compositeKeyRecipe;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRecipe)) return false;
        ProductRecipe that = (ProductRecipe) o;
        return getCompositeKeyRecipe().equals(that.getCompositeKeyRecipe()) &&
                getDescribe().equals(that.getDescribe()) &&
                getProductLine().equals(that.getProductLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompositeKeyRecipe(), getDescribe(), getProductLine());
    }

    @Override
    public String toString() {
        return "ProductRecipe{" +
                "compositeKeyRecipe=" + compositeKeyRecipe +
                ", describe='" + describe + '\'' +
                ", productLine=" + productLine +
                '}';
    }
}