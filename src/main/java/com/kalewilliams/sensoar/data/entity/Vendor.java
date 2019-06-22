package com.kalewilliams.sensoar.data.entity;

import javax.persistence.*;

@Entity
@Table(name="VENDOR")
public class Vendor {
    @Id
    @Column(name="VENDOR_ID")
    private int VendorId;
    @Column(name="VENDOR_NAME")
    private String VendorName;
    @Column(name="VENDOR_ADDRESS")
    private String VendorAddress;
    @Column(name="VENDOR_CITY")
    private String VendorCity;
    @Column(name="VENDOR_STATE")
    private String VendorState;
    @Column(name="VENDOR_ZIP")
    private String VendorZip;
    @Column(name="VENDOR_POC")
    private String VendorPoc;
    @Column(name="VENDOR_PHONE")
    private String VendorPhone;
    @Column(name="PAYMENT_TYPE")
    private String VendorPayType;
    @Column(name="VENDOR_BANK")
    private String VendorBank;
    @Column(name="VENDOR_EIN")
    private String VendorEIN;

    public int getVendorId() {
        return VendorId;
    }

    public void setVendorId(int vendorId) {
        VendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorCity() {
        return VendorCity;
    }

    public void setVendorCity(String vendorCity) {
        VendorCity = vendorCity;
    }

    public String getVendorState() {
        return VendorState;
    }

    public void setVendorState(String vendorState) {
        VendorState = vendorState;
    }

    public String getVendorZip() {
        return VendorZip;
    }

    public void setVendorZip(String vendorZip) {
        VendorZip = vendorZip;
    }

    public String getVendorPoc() {
        return VendorPoc;
    }

    public void setVendorPoc(String vendorPoc) {
        VendorPoc = vendorPoc;
    }

    public String getVendorPhone() {
        return VendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        VendorPhone = vendorPhone;
    }

    public String getVendorPayType() {
        return VendorPayType;
    }

    public void setVendorPayType(String vendorPayType) {
        VendorPayType = vendorPayType;
    }

    public String getVendorBank() {
        return VendorBank;
    }

    public void setVendorBank(String vendorBank) {
        VendorBank = vendorBank;
    }

    public String getVendorEIN() {
        return VendorEIN;
    }

    public void setVendorEIN(String vendorEIN) {
        VendorEIN = vendorEIN;
    }
}
