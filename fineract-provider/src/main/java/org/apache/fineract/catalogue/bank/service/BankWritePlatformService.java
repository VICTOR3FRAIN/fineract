package org.apache.fineract.catalogue.bank.service;

import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;

public interface BankWritePlatformService {
    CommandProcessingResult createBank(JsonCommand command);

    CommandProcessingResult updateBank(Long bankId, JsonCommand command);

    CommandProcessingResult deleteBank(Long bankId, JsonCommand command);
}
