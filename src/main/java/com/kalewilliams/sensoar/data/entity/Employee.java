package com.kalewilliams.sensoar.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @Column(name="EE_ID")
    private int EmpId;
    @Column(name="EE_FNAME")
    private String FirstName;
    @Column(name="EE_LNAME")
    private String LastName;
    @Column(name="EE_SOCSEC")
    private String SocNum;
    @Column(name="EE_ADDRESS")
    private String Address;
    @Column(name="EE_STATE")
    private String State;
    @Column(name="EE_CITY")
    private String City;
    @Column(name="EE_ZIP")
    private String Zip;
    @Column(name="EE_PHONENUM")
    private String PhoneNum;
    @Column(name="EE_DEPT")
    private String Dept;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSocNum() {
        return SocNum;
    }

    public void setSocNum(String socNum) {
        SocNum = socNum;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
