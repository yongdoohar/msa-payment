package callengineer;


public class CallRequestCanceled extends AbstractEvent {

    private Long id;
    private Long engineerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(Long engineerId) {
        this.engineerId = engineerId;
    }
}
