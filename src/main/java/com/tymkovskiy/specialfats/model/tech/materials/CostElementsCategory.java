package com.tymkovskiy.specialfats.model.tech.materials;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cost_elements_category", schema = "tech")
public class CostElementsCategory {

    @Id
    @Column(name = "cost_elements_category_id")
    private Integer id;
    @Column(name = "cost_elements_category_name", nullable = false, unique = true)
    private String name;
    @OneToMany(targetEntity = CostElementsCategory.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CostElements> costElementsSet;

    public CostElementsCategory() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CostElements> getCostElementsSet() {
        return costElementsSet;
    }

    public void setCostElementsSet(Set<CostElements> costElementsSet) {
        this.costElementsSet = costElementsSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostElementsCategory that = (CostElementsCategory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(costElementsSet, that.costElementsSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, costElementsSet);
    }

    @Override
    public String toString() {
        return "CostElementsCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", costElementsSet=" + costElementsSet +
                '}';
    }
}
