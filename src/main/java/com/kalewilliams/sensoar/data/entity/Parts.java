package com.kalewilliams.sensoar.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARTS")
public class Parts {
    @Id
    @Column(name="PART_ID")
    private String PartId;
    @Column(name="VENDOR_ID")
    private int VendorId;
    @Column(name="PART_DESC")
    private String PartDescript;
    @Column(name="UNIT_COST")
    private float UnitCost;
    @Column(name="PART_STATUS")
    private char PartStatus;

    public String getPartId() {
        return PartId;
    }

    public void setPartId(String partId) {
        PartId = partId;
    }

    public int getVendorId() {
        return VendorId;
    }

    public void setVendorId(int vendorId) {
        VendorId = vendorId;
    }

    public String getPartDescript() {
        return PartDescript;
    }

    public void setPartDescript(String partDescript) {
        PartDescript = partDescript;
    }

    public float getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(float unitCost) {
        UnitCost = unitCost;
    }

    public char getPartStatus() {
        return PartStatus;
    }

    public void setPartStatus(char partStatus) {
        PartStatus = partStatus;
    }
}
