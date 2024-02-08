package org.example;

public class centralBankService implements IBankService {
    @Override
    public double convertRate (currencyRate currencyrate) {
        return currencyrate.getPrice() / 30.0; //usd
    }
}
