package com.vinhblue.model.repository.impl;

import com.vinhblue.model.entity.Customer;
import com.vinhblue.model.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> typedQuery =
                BaseRepository.entityManager.createQuery("select c from customer c", Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public Customer findById(String id) {
        TypedQuery<Customer> typedQuery =
                BaseRepository.entityManager.createQuery("select c from customer c " +
                        "where customerId = : customerId", Customer.class);
        typedQuery.setParameter("customerId", id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void save(Customer customer) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        try {
            entityTransaction.begin();
            BaseRepository.entityManager.persist(customer);
            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void update(Customer customer) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        try {
            entityTransaction.begin();
            BaseRepository.entityManager.merge(customer);
            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void delete(String id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        try {
            entityTransaction.begin();
            BaseRepository.entityManager.remove(findById(id));
            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {
            entityTransaction.rollback();
        }
    }
}
