package awslv2flower;

public class ReviewRequested extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String reviewMemo;
    private String status;

    public ReviewRequested(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getReviewMemo() {
        return reviewMemo;
    }

    public void setReviewMemo(String reviewMemo) {
        this.reviewMemo = reviewMemo;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
