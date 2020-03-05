package com.knoldus.model;

import java.util.Optional;

public class AddressDetails {

    private String primaryAddress;
    private Optional<String> secondaryAddress;

    public AddressDetails(String primaryAddress, Optional<String> secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
    }

    public AddressDetails(String primaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = Optional.empty();
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
