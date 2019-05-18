package com.bilgeadam.example.dao;

import com.bilgeadam.example.util.HibernateUtil;
import org.hibernate.Session;

public abstract class BaseDAO {

    private Session session= HibernateUtil.getSession();

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
