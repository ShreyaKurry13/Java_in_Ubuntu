package app.shopping.services;

import app.shopping.data.OrderEntity;
import io.grpc.stub.StreamObserver;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sales.OrderManagerGrpc.OrderManagerImplBase;
import sales.OrderManagerOuterClass.CustomerInput;
import sales.OrderManagerOuterClass.CustomerOrder;

public class OrderManagerService extends OrderManagerImplBase{
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    @Override
    public void fetchOrders(CustomerInput request, StreamObserver<CustomerOrder> responseObserver) {
        try(var em = emf.createEntityManager()){
            em.createQuery("SELECT e from OrderEntity e WHERE e.customerId=:buyer",OrderEntity.class)
            .setParameter("buyer", request.getCustomerCode())
            .getResultList()
            .forEach(entity -> {
                var message = Cus
            });
        }
    }
}
