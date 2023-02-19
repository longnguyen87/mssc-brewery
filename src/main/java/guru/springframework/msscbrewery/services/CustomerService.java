package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getByCustId(UUID custId);

    void updateCustomer(UUID custId, CustomerDto customerDto);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void deleteById(UUID customerId);
}
