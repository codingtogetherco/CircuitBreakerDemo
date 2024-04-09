package co.com.coding.togegher.service;

import co.com.coding.togegher.manager.IPaymentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    private IPaymentManager paymentManager;

    @Autowired
    public PaymentService(IPaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    @Override
    public String processPayment() throws Exception{
        return paymentManager.processPayment();
    }
}
