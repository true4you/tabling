package tabling.domain;

import tabling.domain.ReceptAdded;
import tabling.domain.ReceptCanceled;
import tabling.ReceptApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date; 


@Entity
@Table(name="Recept_table")
public class Recept  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long id;
    
    
    private Long customerId;
    
    
    private Long customerNum;
    
    
    private String storeName;
    
    
    private Long storeId;
    
    
    private Date updatedAt;

    @PostPersist
    public void onPostPersist(){
        ReceptAdded receptAdded = new ReceptAdded();
        BeanUtils.copyProperties(this, receptAdded);
        receptAdded.publishAfterCommit();

        ReceptCanceled receptCanceled = new ReceptCanceled();
        BeanUtils.copyProperties(this, receptCanceled);
        receptCanceled.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }



    public static ReceptRepository repository(){
        ReceptRepository receptRepository = ReceptApplication.applicationContext.getBean(ReceptRepository.class);
        return receptRepository;
    }




}
