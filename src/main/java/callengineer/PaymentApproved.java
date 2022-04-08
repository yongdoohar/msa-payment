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

    public void setId(Long Id) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setId()    " + Id);
        this.id = id;
    }
    public Long getCallId() {
        return callId;
    }

    public void setCallId(Long CallId) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setCallId()    " + callId);
        this.callId = callId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        System.out.println("\n\n##### PaymentApproved test >> PaymentApproved.setStatus()    " + status);
        this.status = status;
    }
}
