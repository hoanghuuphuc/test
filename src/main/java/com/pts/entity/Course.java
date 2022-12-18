package com.pts.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "course")
@Getter
@Setter
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tps_id;
    String tps_Name;
    String tps_image;
    int tps_discount;
    int tps_Price;
    String tps_information;
    String tps_Teacher;
    Date tps_date = new Date();
    boolean tps_Status;
    @ManyToOne
    @JoinColumn(name ="tps_categoryid")
    private Category category;
    @OneToMany(mappedBy = "course")
    List<Content> content;


}
