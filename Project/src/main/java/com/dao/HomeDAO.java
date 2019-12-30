package com.dao;

import java.util.List;


import com.pojo.Main;

public interface HomeDAO {

	public List<Main> listCategory(String product_list);
	public List<Main> listCategory1(String product_list);
	public List<Main> list(int product_id);
}
