
package awslv2flower;

public class ReviewWrited extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String reviewMemo;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public long getOrderId() {
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
