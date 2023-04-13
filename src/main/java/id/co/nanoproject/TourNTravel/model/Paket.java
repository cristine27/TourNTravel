package id.co.nanoproject.TourNTravel.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paket")
@Data
public class Paket {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "jenis")
    private String jenis;
    @Column(name = "deskripsi")
    private String deskripsi;
    @Column(name = "harga")
    private String harga;
}
