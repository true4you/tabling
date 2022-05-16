package tabling.domain;

import tabling.domain.SeatAdded;
import tabling.domain.SeatCanceled;
import tabling.SeatApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date; 


@Entity
@Table(name="Seat_table")
public class Seat  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long id;
    
    
    private Long storeId;
    
    
    private String storeName;
    
    
    private Long customerId;
    
    
    private Long customerNum;
    
    
    private Long seatRemained;
    
    
    private Long waitNum;
    
    
    private Date updatedAt;

    @PostPersist
    public void onPostPersist(){
        SeatAdded seatAdded = new SeatAdded();
        BeanUtils.copyProperties(this, seatAdded);
        seatAdded.publishAfterCommit();

        SeatCanceled seatCanceled = new SeatCanceled();
        BeanUtils.copyProperties(this, seatCanceled);
        seatCanceled.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Long customerNum) {
        this.customerNum = customerNum;
    }

    public Long getSeatRemained() {
        return seatRemained;
    }

    public void setSeatRemained(Long seatRemained) {
        this.seatRemained = seatRemained;
    }

    public Long getWaitNum() {
        return waitNum;
    }

    public void setWaitNum(Long waitNum) {
        this.waitNum = waitNum;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }



    public static SeatRepository repository(){
        SeatRepository seatRepository = SeatApplication.applicationContext.getBean(SeatRepository.class);
        return seatRepository;
    }




}
