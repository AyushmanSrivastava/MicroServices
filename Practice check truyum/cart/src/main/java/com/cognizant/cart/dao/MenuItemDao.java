package com.cognizant.cart.dao;

import java.util.*;

import org.springframework.stereotype.Component;

import com.cognizant.cart.model.MenuItem;

@Component
public interface MenuItemDao {
	
	public List<MenuItem> getMenuItemListAdmin();
	
	public List<MenuItem> getMenuItemListCustomer();
	
	public void modifyMenuItem(MenuItem menuItem);
	
	public MenuItem getMenuItem(long menuItemId);
}
