package com.tymkovskiy.specialfats.model.tech.products;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_recipe_composed", schema = "tech")
public class ProductRecipeComposed {

    @EmbeddedId
    private CompositeKeyRecipeComposed compositeKeyRecipeComposed;

    @Column(name = "product_recipe_composed_shape", nullable = false,
            columnDefinition = "real CONSTRAINT shape_check CHECK " +
                    "(product_recipe_composed_shape <= 1 AND product_recipe_composed_shape > 0 )")
    private Float share;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "product_recipe_id", referencedColumnName = "product_recipe_id",
                    nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "product_recipe_product_line", referencedColumnName = "product_recipe_product_line",
                    nullable = false, insertable = false, updatable = false)
    })
    private ProductRecipe productRecipe;

    @ManyToOne
    @JoinColumn(
            name = "product_recipe_cost_elements",
            nullable = false,
            referencedColumnName = "cost_elements_id",
            insertable = false,
            updatable = false)
    private CostElements costElements;


    public ProductRecipeComposed() {
    }

    public CompositeKeyRecipeComposed getCompositeKeyRecipeComposed() {
        return compositeKeyRecipeComposed;
    }

    public void setCompositeKeyRecipeComposed(CompositeKeyRecipeComposed compositeKeyRecipeComposed) {
        this.compositeKeyRecipeComposed = compositeKeyRecipeComposed;
    }

    public Float getShare() {
        return share;
    }

    public void setShare(Float share) {
        this.share = share;
    }

    public ProductRecipe getProductRecipe() {
        return productRecipe;
    }

    public void setProductRecipe(ProductRecipe productRecipe) {
        this.productRecipe = productRecipe;
    }

    public CostElements getCostElements() {
        return costElements;
    }

    public void setCostElements(CostElements costElements) {
        this.costElements = costElements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRecipeComposed)) return false;
        ProductRecipeComposed that = (ProductRecipeComposed) o;
        return Objects.equals(getCompositeKeyRecipeComposed(), that.getCompositeKeyRecipeComposed()) &&
                Objects.equals(getShare(), that.getShare()) &&
                Objects.equals(getProductRecipe(), that.getProductRecipe()) &&
                Objects.equals(getCostElements(), that.getCostElements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompositeKeyRecipeComposed(), getShare(), getProductRecipe(), getCostElements());
    }

    @Override
    public String toString() {
        return "ProductRecipeComposed{" +
                "compositeKeyRecipeComposed=" + compositeKeyRecipeComposed +
                ", share=" + share +
                ", productRecipe=" + productRecipe +
                ", costElements=" + costElements +
                '}';
    }
}
