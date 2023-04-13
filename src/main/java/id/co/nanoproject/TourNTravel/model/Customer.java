package id.co.nanoproject.TourNTravel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "email")
    private String email;
    @Column(name = "no_hp")
    private String no_hp;
}
