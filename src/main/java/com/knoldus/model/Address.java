package com.knoldus.model;

import java.util.Optional;

public class Address {

    private String primaryAddress;
    private Optional<String> secondaryAddress;

    public Address(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    public Address(String primaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = Optional.ofNullable(null);
    }

    @Override
    public String toString() {
        return String.format("Primary com.knoldus.model.Address : %s Secondary com.knoldus.model.Address : %s ", getPrimaryAddress(), getSecondaryAddress());
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public Optional<String> getSecondaryAddress() {
        return secondaryAddress;
    }
}
