package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.entity.OrderReq;
import id.co.nanoproject.TourNTravel.entity.OrderResp;
import id.co.nanoproject.TourNTravel.model.Customer;
import id.co.nanoproject.TourNTravel.model.OrderTransaction;
import id.co.nanoproject.TourNTravel.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    private final String MENUNGGU_PEMBAYARAN = "MENUNGGU_PEMBAYARAN";
    @Autowired
    public OrderRepo orderRepo;

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
        int order_id = orderRepo.save(newOrder).getId();

        OrderResp resp = new OrderResp();
        resp.setOrder_id(order_id);
        resp.setNamaCust(custName);
        resp.setHarga(hargaPaket);
        resp.setStatus_pembayaran(MENUNGGU_PEMBAYARAN);
        return resp;
    }

    public OrderResp updateStatusPembayaran(OrderReq req){
        return null;
    }
    public OrderResp findById(int id){
        Optional<OrderTransaction> orderTransaction = orderRepo.findById(id);
        Optional<Customer> cust = custService.findById(orderTransaction.get().getId_cust());
        String hargaPaket = paketService.findHargaById(orderTransaction.get().getId_paket());

        OrderResp resp = new OrderResp();
        resp.setOrder_id(orderTransaction.get().getId());
        resp.setHarga(hargaPaket);
        resp.setNamaCust(cust.get().getNama());
        resp.setNoKtp(cust.get().getNo_ktp());
        resp.setStatus_pembayaran(orderTransaction.get().getStatus_pembayaran());

        return resp;
    }
}
