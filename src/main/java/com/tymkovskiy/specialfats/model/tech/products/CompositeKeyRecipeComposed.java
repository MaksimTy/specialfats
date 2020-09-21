package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompositeKeyRecipeComposed implements Serializable {

    @Column(name = "product_recipe_id", nullable = false)
    private Integer id;

    @Column(name = "product_recipe_product_line", nullable = false)
    private Integer product_line_id;

    @Column(name = "product_recipe_cost_elements", nullable = false)
    private Integer cost_elements_id;

    public CompositeKeyRecipeComposed() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_line_id() {
        return product_line_id;
    }

    public void setProduct_line_id(Integer product_line_id) {
        this.product_line_id = product_line_id;
    }

    public Integer getCost_elements_id() {
        return cost_elements_id;
    }

    public void setCost_elements_id(Integer cost_elements_id) {
        this.cost_elements_id = cost_elements_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompositeKeyRecipeComposed)) return false;
        CompositeKeyRecipeComposed that = (CompositeKeyRecipeComposed) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getProduct_line_id(), that.getProduct_line_id()) &&
                Objects.equals(getCost_elements_id(), that.getCost_elements_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProduct_line_id(), getCost_elements_id());
    }

    @Override
    public String toString() {
        return "CompositeKeyRecipeComposed{" +
                "id=" + id +
                ", product_line_id=" + product_line_id +
                ", cost_elements_id=" + cost_elements_id +
                '}';
    }
}
