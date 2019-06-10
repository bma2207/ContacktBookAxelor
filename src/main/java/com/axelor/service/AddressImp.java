package com.axelor.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.sound.midi.Soundbank;

import com.axelor.domains.ContactDetails;
import com.axelor.domains.ManageAddress;

public class AddressImp implements AddressService {
	public EntityManager getConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		return em;
	}

	@Override
	public void addAddress(int id, String address) {
		EntityManager entityManager = getConnection();
		entityManager.getTransaction().begin();
		ContactDetails cd = new ContactDetails();
		cd.setCid(id);

		ManageAddress ma = new ManageAddress();
		ma.setAddress(address);
		ma.setCd(cd);

		entityManager.persist(ma);
		entityManager.getTransaction().commit();
	}

	@Override
	public List<ManageAddress> update(int cid) {
		System.out.println("Address Impliment Cid " + cid);
		EntityManager entityManager = getConnection();
		Query query = entityManager.createQuery("from ManageAddress  where cd_cid=:id ");
		query.setParameter("id", cid);
	List<ManageAddress> result= query.getResultList();
		for (ManageAddress m : result)
		{
			System.out.println(m.getAddress() + "" + m.getAid());
		}
		
		
		return result;
	}

	@Override
	public void updateAddress(int cid, String address) {
		// TODO Auto-generated method stub
		EntityManager entityManager = getConnection();
		entityManager.getTransaction().begin();

		Query query = entityManager
				.createQuery("update ManageAddress set Address=:add  where Aid=:id");
		query.setParameter("id",cid);
		query.setParameter("add", address);
		

		query.executeUpdate();
		entityManager.getTransaction().commit();
	}
	@Override
	public List<ManageAddress> updateById(int cid)
	{
		EntityManager entityManager = getConnection();
		Query query = entityManager.createQuery("from ManageAddress  where Aid=:id ");
		query.setParameter("id", cid);
	List<ManageAddress> result= query.getResultList();
		for (ManageAddress m : result)
		{
			System.out.println(m.getAddress() + "" + m.getAid());
		}
		
		
		return result;
		
	}


	
}
