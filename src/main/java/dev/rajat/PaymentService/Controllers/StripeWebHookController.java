package dev.rajat.PaymentService.Controllers;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebHookController {

    @PostMapping
    public void stripeWebhook(Event event){
        if(event.getType().isBlank()){
            System.out.println("No event happened!");
        }
    }
}
