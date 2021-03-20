package biat.springframework.msscbreweryv2.Web.Service;

import biat.springframework.msscbreweryv2.Web.Model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("aymen braiek").build();
    }
}
