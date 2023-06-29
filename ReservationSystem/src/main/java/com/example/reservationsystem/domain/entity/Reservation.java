/*package com.example.reservationsystem.domain.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="res_table")
public class Reservation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer resnumber;

private Integer pernumber;
@ManyToOne
@JoinColumn(name="pernumber", insertable=false, updatable=false)
private Personal personal;

private Integer plannumber;
@ManyToOne
@JoinColumn(name="pernumber", insertable=false, updatable=false)
private Plan plan;
}
*/