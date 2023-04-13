package id.co.nanoproject.TourNTravel.entity;

import lombok.Data;

@Data
public class OrderResp {

    private String namaCust;
    private String harga;
    private String status_pembayaran;
}
