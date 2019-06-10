package com.axelor.service;

import java.util.List;

import com.axelor.domains.ManageAddress;



public interface AddressService {

	void addAddress(int id,String address);
	List<ManageAddress> update(int cid);
	void updateAddress(int aid,String address);
	List<ManageAddress> updateById(int cid);
}
