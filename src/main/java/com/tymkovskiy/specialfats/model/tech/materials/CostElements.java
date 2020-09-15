package com.tymkovskiy.specialfats.model.tech.materials;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cost_elements", schema = "tech")
public class CostElements {

    @Id
    @Column(name = "cost_elements_id")
    private Integer id;
    @Column(name = "cost_elements_code", nullable = false, unique = true)
    private String code;
    @Column(name = "cost_elements_name", nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "cost_elements_metrics", nullable = false, referencedColumnName = "metrics_id")
    private Metrics metrics;

    @ManyToOne
    @JoinColumn(name = "cost_elements_category", nullable = false, referencedColumnName = "cost_elements_category_id")
    private CostElementsCategory costElementsCategory;

    public CostElements() {
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
        this.name = name.trim();
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics unit) {
        this.metrics = unit;
    }

    public CostElementsCategory getCostElementsCategory() {
        return costElementsCategory;
    }

    public void setCostElementsCategory(CostElementsCategory costElementsCategory) {
        this.costElementsCategory = costElementsCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostElements that = (CostElements) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(metrics, that.metrics) &&
                Objects.equals(costElementsCategory, that.costElementsCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, metrics, costElementsCategory);
    }

    @Override
    public String toString() {
        return "CostElements{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", metrics=" + metrics +
                ", costElementsCategory=" + costElementsCategory +
                '}';
    }
}
