package com.contApp.component;

import com.contApp.model.Firm;
import com.contApp.model.User;
import com.contApp.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevComp implements ApplicationListener<ContextRefreshedEvent> {


    private FirmRepository firmRepository;
    private InvoiceRepository invoiceRepository;
    private UserRepository userRepository;
    private SupplierRepository supplierRepository;
    private PaymentRepository paymentRepository;

    public DevComp(FirmRepository firmRepository, InvoiceRepository invoiceRepository, UserRepository userRepository, SupplierRepository supplierRepository, PaymentRepository paymentRepository) {
        this.firmRepository = firmRepository;
        this.invoiceRepository = invoiceRepository;
        this.userRepository = userRepository;
        this.supplierRepository = supplierRepository;
        this.paymentRepository = paymentRepository;
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){



        User user = new User();
        user.setAdmin(false);
        user.setUserName("username");

Firm firm=new Firm();
firm.setFirmName("FirmName");
user.setFirm(firm);
firm.setUser(user);
userRepository.save(user);
firmRepository.save(firm);


/*
        firm.setUser(user);
        Supplier supplier = new Supplier();
        supplier.setFirm(firm);
        supplier.setSupplierName("SupplierName");


        Invoice invoice =new Invoice();
        invoice.setInvoiceDate(new Date());
        invoice.setInvoiceNumber(123456);
        invoice.setValue(500);

        Supplier supplier = new Supplier();
        supplier.setFirm(firm);
        supplier.setSupplierName("SupplierName");
        List<Invoice> invoiceList=   new ArrayList<>();
        invoiceList.add(invoice);
        supplier.setInvoiceList(invoiceList);
        firm.setSupplier(supplier);

        Payment payment = new Payment();
        payment.setInvoice(invoice);
        payment.setPaymentDate(new Date());
        payment.setPaymentMethod(PaymentMethod.CASH);



        invoiceRepository.save(invoice);
        paymentRepository.save(payment);
        supplierRepository.save(supplier);

 */




}}



