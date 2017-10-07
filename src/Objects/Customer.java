package Objects;

import io.swagger.client.ApiException;
import io.swagger.client.model.Account;

public class Customer {

    private Account account;

    public Customer() {
        ApiBridge apiBridge = new ApiBridge();
        try {
            account = apiBridge.getAccountApi().accountGet();
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public Long getBalance()
    {
        return account.getBalance();
    }
}
