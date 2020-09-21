package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

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

    @OneToMany(targetEntity = ProductRecipe.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductRecipeComposed> productRecipeComposedSet;

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

    public Set<ProductRecipeComposed> getProductRecipeComposedSet() {
        return productRecipeComposedSet;
    }

    public void setProductRecipeComposedSet(Set<ProductRecipeComposed> productRecipeComposedSet) {
        this.productRecipeComposedSet = productRecipeComposedSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRecipe)) return false;
        ProductRecipe that = (ProductRecipe) o;
        return Objects.equals(getCompositeKeyRecipe(), that.getCompositeKeyRecipe()) &&
                Objects.equals(getDescribe(), that.getDescribe()) &&
                Objects.equals(getProductLine(), that.getProductLine()) &&
                Objects.equals(getProductRecipeComposedSet(), that.getProductRecipeComposedSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompositeKeyRecipe(), getDescribe(), getProductLine(), getProductRecipeComposedSet());
    }

    @Override
    public String toString() {
        return "ProductRecipe{" +
                "compositeKeyRecipe=" + compositeKeyRecipe +
                ", describe='" + describe + '\'' +
                ", productLine=" + productLine +
                ", productRecipeComposedSet=" + productRecipeComposedSet +
                '}';
    }
}