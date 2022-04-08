package callengineer;


public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Long callId;
    private String status;

    public PaymentApproved(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setId()    " + id);
        this.id = id;
    }
    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long callId) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setCallId()    " + callId);
        this.callId = callId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setStatus()    " + status);
        this.status = status;
    }
}
