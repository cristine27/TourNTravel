package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.entity.OrderReq;
import id.co.nanoproject.TourNTravel.entity.OrderResp;
import id.co.nanoproject.TourNTravel.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public OrderRepo repo;

    @Autowired
    private CustomerService custService;

    @Autowired
    private PaketService paketService;

    public OrderResp orderPaket(OrderReq orderReq){
        String custName = custService.findNamaById(orderReq.getId_cust());
        String hargaPaket = paketService.findHargaById(orderReq.getId_paket());

        OrderResp resp = new OrderResp();
        resp.setNamaCust(custName);
        resp.setHarga(hargaPaket);
        resp.setStatus_pembayaran("MENUNGGU PEMBAYARAN");
        return resp;
    }
}
