package com.tymkovskiy.specialfats.model.tech.products;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.MaterialQualityLevel;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_recipe_composed", schema = "tech")
public class ProductRecipeComposed {

    @EmbeddedId
    private CompositeKeyRecipeComposed compositeKeyRecipeComposed;

    @Column(name = "product_recipe_cost_elements_quality_level")
    private Integer materialLevel;

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

    @ManyToOne
    @JoinColumn(
            name = "product_recipe_cost_elements_quality_level",
            referencedColumnName = "quality_level_id",
            insertable = false,
            updatable = false)
    private MaterialQualityLevel materialQualityLevel;


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

    public Integer getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(Integer materialLevel) {
        this.materialLevel = materialLevel;
    }

    public MaterialQualityLevel getMaterialQualityLevel() {
        return materialQualityLevel;
    }

    public void setMaterialQualityLevel(MaterialQualityLevel materialQualityLevel) {
        this.materialQualityLevel = materialQualityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRecipeComposed)) return false;
        ProductRecipeComposed that = (ProductRecipeComposed) o;
        return Objects.equals(getCompositeKeyRecipeComposed(), that.getCompositeKeyRecipeComposed()) &&
                Objects.equals(getMaterialLevel(), that.getMaterialLevel()) &&
                Objects.equals(getShare(), that.getShare()) &&
                Objects.equals(getProductRecipe(), that.getProductRecipe()) &&
                Objects.equals(getCostElements(), that.getCostElements()) &&
                Objects.equals(getMaterialQualityLevel(), that.getMaterialQualityLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompositeKeyRecipeComposed(), getMaterialLevel(), getShare(), getProductRecipe(), getCostElements(), getMaterialQualityLevel());
    }

    @Override
    public String toString() {
        return "ProductRecipeComposed{" +
                "compositeKeyRecipeComposed=" + compositeKeyRecipeComposed +
                ", materialLevel=" + materialLevel +
                ", share=" + share +
                ", productRecipe=" + productRecipe +
                ", costElements=" + costElements +
                ", materialQualityLevel=" + materialQualityLevel +
                '}';
    }
}
