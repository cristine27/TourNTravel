package id.co.nanoproject.TourNTravel.entity;

import lombok.Data;

@Data
public class OrderReq {
    private int id_cust;
    private int id_paket;
    private int id_billing;
}
