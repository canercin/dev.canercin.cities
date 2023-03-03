package com.springdemo.springbootrefresh.DataAccessLayers;


import com.springdemo.springbootrefresh.Entities.City;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
public class HibernateCityDal implements ICityDal{
    private EntityManager entityManager;
    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from City", City.class).getResultList();
    }

    @Override
    public void add(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        City cityToDelete = session.get(City.class, city.getCity_id());
        session.delete(cityToDelete);
    }

    @Override
    public City getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(City.class, id);
    }

}
