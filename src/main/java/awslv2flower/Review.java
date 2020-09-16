package awslv2flower;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Review_table")
public class Review {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long orderId;
    private String reviewMemo;
    private String status;

    @PostPersist
    public void onPostPersist(){
        if(this.getStatus().equals("Shipped")) {
            ReviewRequested reviewRequested = new ReviewRequested();
            BeanUtils.copyProperties(this, reviewRequested);
            reviewRequested.publishAfterCommit();
        }

        else if(this.getStatus().equals("ReviewWrited")){
            ReviewWrited reviewWrited = new ReviewWrited();
            BeanUtils.copyProperties(this, reviewWrited);
            reviewWrited.publishAfterCommit();
        }

    }


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
