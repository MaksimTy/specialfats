package com.tymkovskiy.specialfats.model.tech.materials;

import com.tymkovskiy.specialfats.model.tech.products.ProductRecipeComposed;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "material_quality_level", schema = "tech")
public class MaterialQualityLevel {

    @Id
    @Column(name = "quality_level_id")
    private Integer id;
    @Column(name = "quality_level_code", nullable = false, unique = true, insertable = false, updatable = false)
    private String code;
    @Column(name = "quality_level_rank", nullable = false, unique = true)
    private Integer rank;

    @OneToMany(targetEntity = MaterialQualityLevel.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductRecipeComposed> productRecipeComposedSet;

    public MaterialQualityLevel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
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
        if (!(o instanceof MaterialQualityLevel)) return false;
        MaterialQualityLevel that = (MaterialQualityLevel) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getRank(), that.getRank()) &&
                Objects.equals(getProductRecipeComposedSet(), that.getProductRecipeComposedSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCode(), getRank(), getProductRecipeComposedSet());
    }

    @Override
    public String toString() {
        return "MaterialQualityLevel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", rank=" + rank +
                ", productRecipeComposedSet=" + productRecipeComposedSet +
                '}';
    }
}
