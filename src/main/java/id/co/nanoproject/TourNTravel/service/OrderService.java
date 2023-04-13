package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.entity.OrderReq;
import id.co.nanoproject.TourNTravel.entity.OrderResp;
import id.co.nanoproject.TourNTravel.model.OrderTransaction;
import id.co.nanoproject.TourNTravel.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final String MENUNGGU_PEMBAYARAN = "MENUNGGU_PEMBAYARAN";
    @Autowired
    public OrderRepo repo;

    @Autowired
    private CustomerService custService;

    @Autowired
    private PaketService paketService;

    public OrderResp orderPaket(OrderReq orderReq){
        String custName = custService.findNamaById(orderReq.getId_cust());
        String hargaPaket = paketService.findHargaById(orderReq.getId_paket());

        OrderTransaction newOrder = new OrderTransaction();
        newOrder.setId_paket(orderReq.getId_paket());
        newOrder.setId_cust(orderReq.getId_cust());
        newOrder.setStatus_pembayaran(MENUNGGU_PEMBAYARAN);
        repo.save(newOrder);

        OrderResp resp = new OrderResp();
        resp.setNamaCust(custName);
        resp.setHarga(hargaPaket);
        resp.setStatus_pembayaran(MENUNGGU_PEMBAYARAN);
        return resp;
    }
}
