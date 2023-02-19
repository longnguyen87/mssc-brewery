package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getByCustId(UUID custId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name(RandomStringUtils.randomAlphabetic(10))
                .build();
    }

    @Override
    public void updateCustomer(UUID custId, CustomerDto customerDto) {
        log.debug("Updating customerDto: " + customerDto.toString() );
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer: " + customerId);
    }
}
