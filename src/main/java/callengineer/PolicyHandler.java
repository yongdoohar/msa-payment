package callengineer;

import callengineer.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired PaymentInformationRepository paymentInformationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCallRequestCanceled_CancelPayment(@Payload CallRequestCanceled callRequestCanceled){

        if(!callRequestCanceled.validate()) return;

        System.out.println("\n\n##### listener CancelPayment : " + callRequestCanceled.toJson() + "\n\n");


        

        // Sample Logic //
        // PaymentInformation paymentInformation = new PaymentInformation();
        // paymentInformationRepository.save(paymentInformation);

    }


}


