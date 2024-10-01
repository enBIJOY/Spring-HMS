package com.hms.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PatientDischarge")
public class PatientDischarge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //
    @Column(name = "Discharge")
    private String patientName;
    private  String bedNo;
    private int contactNumber;
    private int date;
}
