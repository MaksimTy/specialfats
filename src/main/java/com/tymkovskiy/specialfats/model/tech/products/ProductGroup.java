package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "product_group", schema = "tech")
public class ProductGroup {

    @Id
    @Column(name = "product_group_id")
    private Integer id;
    @Column(name = "product_group_code", nullable = false, unique = true )
    private String code;
    @Column(name = "product_group_name", nullable = false, unique = true )
    private String name;
    @Column(name = "product_group_describe")
    private String describe;
    @OneToMany(targetEntity = ProductGroup.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductLine> productLineSet;

    public ProductGroup() {
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

    public Set<ProductLine> getProductLineSet() {
        return productLineSet;
    }

    public void setProductLineSet(Set<ProductLine> productLineSet) {
        this.productLineSet = productLineSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductGroup that = (ProductGroup) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(productLineSet, that.productLineSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, describe, productLineSet);
    }

    @Override
    public String toString() {
        return "ProductGroup{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", productLineSet=" + productLineSet +
                '}';
    }
}
