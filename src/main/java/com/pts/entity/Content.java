package com.pts.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "content")
public class Content implements Serializable {
    @Id
    int tps_Id;
    @ManyToOne
    @JoinColumn(name ="tps_IdCourse")
    private Course course;
    String tps_Content;
    String tps_LinkYTB;
}

