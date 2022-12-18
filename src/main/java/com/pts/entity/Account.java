package com.pts.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    String tps_Username;
    String tps_Password;
    String tps_Gmail;
    String tps_Number;
    Date tps_Date = new Date();
    String tps_Photo;
    Float tps_Money;
    @JsonIgnore
    @OneToMany(mappedBy ="account",fetch = FetchType.EAGER)
    List<Authority> authorities;


}
