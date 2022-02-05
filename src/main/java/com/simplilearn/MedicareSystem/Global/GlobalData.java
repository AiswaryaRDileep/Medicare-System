package com.simplilearn.MedicareSystem.Global;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.MedicareSystem.Model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
