package tabling.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="OrderList_table")
public class OrderList {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long storeId;
        private String storeName;
        private Long seatRemained;
        private Long waitNum;
        private Date updatedAt;


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

}