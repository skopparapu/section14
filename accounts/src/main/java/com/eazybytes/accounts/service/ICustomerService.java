package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import org.springframework.http.ResponseEntity;

public interface ICustomerService {

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details on a given mobile number.
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
