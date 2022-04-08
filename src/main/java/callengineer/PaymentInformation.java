package callengineer;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="PaymentInformation_table")
public class PaymentInformation  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long callId;

    private String status;


    @PostPersist
    public void onPostPersist(){
        PaymentApproved paymentApproved = new PaymentApproved();
        paymentApproved.setCallId(Long.valueOf(11));
        paymentApproved.setStatus("1");
        System.out.println("\n\n##### this.getCallId()    " + this.getCallId());
        System.out.println("\n\n##### this.getStatus()    " + this.getStatus());
        
        System.out.println("\n\n##### paymentApproved.toJson() : " + paymentApproved.toJson() + "\n\n");
        BeanUtils.copyProperties(this, paymentApproved);

        paymentApproved.setCallId(this.getCallId());
        paymentApproved.setStatus(this.getStatus());

        System.out.println("\n\n##### paymentApproved.getCallId()    " + paymentApproved.getCallId());
        System.out.println("\n\n##### paymentApproved.getStatus()    " + paymentApproved.getStatus());

        System.out.println("\n\n##### paymentApproved.toJson() : " + paymentApproved.toJson() + "\n\n");

        paymentApproved.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long callId) {
        this.callId = callId;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
