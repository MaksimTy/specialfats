package com.tymkovskiy.specialfats.model.tech.materials;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "metrics", schema = "tech")
public class Metrics {

    @Id
    @Column(name = "metrics_id")
    private Integer id;
    @Column(name = "metrics_code", nullable = false, unique = true)
    private String code;
    @Column(name = "metrics_name", nullable = false, unique = true)
    private String name;
    @Column(name = "metrics_codename", nullable = false, unique = true)
    private String codename;
    @OneToMany(targetEntity = Metrics.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CostElements> materials;

    public Metrics() {
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
        this.code = code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename.trim();
    }

    public Set<CostElements> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<CostElements> materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metrics metrics = (Metrics) o;
        return Objects.equals(id, metrics.id) &&
                Objects.equals(code, metrics.code) &&
                Objects.equals(name, metrics.name) &&
                Objects.equals(codename, metrics.codename) &&
                Objects.equals(materials, metrics.materials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, codename, materials);
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", codename='" + codename + '\'' +
                ", materials=" + materials +
                '}';
    }
}