package id.co.nanoproject.TourNTravel.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_cust")
    private int id_cust;
    @Column(name = "id_paket")
    private int id_paket;
    @Column(name = "id_payment")
    private int id_payment;
    @Column(name = "status_pembayaran")
    private String status_pembayaran;
}
