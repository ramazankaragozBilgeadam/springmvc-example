package com.bilgeadam.example.dao;

import com.bilgeadam.example.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO implements IUserDAO{


    @Override
    public void kaydet(User user) {

        Transaction transaction=null;

        try{
            transaction=getSession().beginTransaction();
            getSession().save(user);


        }catch (HibernateException ex){
            ex.printStackTrace();
            transaction.rollback();
        }finally {
            transaction.commit();
        }

    }
}
