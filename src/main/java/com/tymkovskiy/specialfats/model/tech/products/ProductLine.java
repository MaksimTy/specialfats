package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "product_line", schema = "tech")
public class ProductLine {

    @Id
    @Column(name = "product_line_id")
    private Integer id;
    @Column(name = "product_line_code", nullable = false, unique = true)
    private String code;
    @Column(name = "product_line_name", nullable = false, unique = true)
    private String name;
    @Column(name = "product_line_describe")
    private String describe;

    @ManyToOne
    @JoinColumn(name = "product_line_product_group", nullable = false, referencedColumnName = "product_group_id")
    private ProductGroup productGroup;

    @OneToMany(targetEntity = ProductLine.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductRecipe> productRecipeSet;


    public ProductLine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = Integer.valueOf(this.code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public Set<ProductRecipe> getProductRecipeSet() {
        return productRecipeSet;
    }

    public void setProductRecipeSet(Set<ProductRecipe> productRecipeSet) {
        this.productRecipeSet = productRecipeSet;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductLine that = (ProductLine) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(productGroup, that.productGroup) &&
                Objects.equals(productRecipeSet, that.productRecipeSet);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, describe, productGroup, productRecipeSet);
    }

    @Override
    public String toString() {
        return "ProductLine{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", productGroup=" + productGroup +
                ", productRecipeSet=" + productRecipeSet +
                '}';
    }
}
