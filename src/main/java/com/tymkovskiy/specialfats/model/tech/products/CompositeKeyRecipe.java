package com.tymkovskiy.specialfats.model.tech.products;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompositeKeyRecipe implements Serializable {

    @Column(name = "product_recipe_id", nullable = false)
    private Integer id;

    @Column(name = "product_recipe_product_line", nullable = false)
    private Integer product_line_id;

    public CompositeKeyRecipe(Integer id, Integer product_line_id) {
        this.id = id;
        this.product_line_id = product_line_id;
    }

    public CompositeKeyRecipe() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyRecipe that = (CompositeKeyRecipe) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(product_line_id, that.product_line_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product_line_id);
    }

    @Override
    public String toString() {
        return "CompositeKeyRecipe{" +
                "id=" + id +
                ", product_line_id=" + product_line_id +
                '}';
    }
}
