package cn.com.zhxj.common.dao.entity;

import cn.com.zhxj.common.dao.annotation.InsertTime;
import cn.com.zhxj.common.dao.core.Entity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "TD_COMPANY")
public class TdCompanyParent implements Entity {
    @InsertTime
    @Column(name = "FD_CREATETIME")
    private Date   fd_createtime;

    @Column(name = "FD_NAME")
    private String fd_name;

}
