package com.kalewilliams.sensoar.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.text.DateFormat;

@Entity
@Table(name="PRODUCT")
public class Product {
    @Id
    @Column(name="PRODUCT_ID")
    private String ProductId;
    @Column(name="PRODUCT_DESC")
    private String ProductDesc;
    @Column(name="DATE_OF_MAN")
    private Date DateOfMan;
    @Column(name="SHIP_STATUS")
    private char ShipStatus;

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductDesc() {
        return ProductDesc;
    }

    public void setProductDesc(String productDesc) {
        ProductDesc = productDesc;
    }

    public Date getDateOfMan() {
        return DateOfMan;
    }

    public void setDateOfMan(Date dateOfMan) {
        DateOfMan = dateOfMan;
    }

    public char getShipStatus() {
        return ShipStatus;
    }

    public void setShipStatus(char shipStatus) {
        ShipStatus = shipStatus;
    }
}
