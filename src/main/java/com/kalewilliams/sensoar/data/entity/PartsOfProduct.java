package com.kalewilliams.sensoar.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PARTSOFPRODUCT")
public class PartsOfProduct {

    @Column(name="PRODUCT_ID")
    private String ProductId;
    @Column(name="PART_ID")
    private String PartId;

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getPartId() {
        return PartId;
    }

    public void setPartId(String partId) {
        PartId = partId;
    }
}
