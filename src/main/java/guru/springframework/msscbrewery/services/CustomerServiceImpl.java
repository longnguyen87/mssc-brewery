package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getByCustId(UUID custId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
