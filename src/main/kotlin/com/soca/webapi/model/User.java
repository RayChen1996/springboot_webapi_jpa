package com.soca.webapi.model;


import jakarta.persistence.*;

@Entity
@Table(name = "USERS")  // 指定對應的資料庫表名稱
public class User {
    @Id
    @Column(name = "U_IDX")
    private int uIdx;// 使用"U_IDX"作為主鍵欄位名稱

    @Column(name = "U_NAME")
    private String username;



    // Getter 和 Setter 方法
    public int getUIdx() {
        return uIdx;
    }

    public void setUIdx(int uIdx) {
        this.uIdx = uIdx;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
