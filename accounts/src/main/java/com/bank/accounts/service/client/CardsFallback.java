package com.bank.accounts.service.client;

import com.bank.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallback implements CardsFeignClient {
    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationID, String mobileNumber) {
        return null;
    }
}
