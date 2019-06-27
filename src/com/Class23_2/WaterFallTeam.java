package com.Class23_2;

import com.Class23.Employee;

public class WaterFallTeam extends Employee {//baska package dan extand yapinca import etmek gerekiyor.
	
public static void main(String[] args) {
	
	WaterFallTeam wt = new WaterFallTeam();
	wt.salary1=90000; //protected values 'u baska package tan alip kullanabiliriz.
	//wt.salary; we can not access default values from different package through inheritance
	//default variable i baska package tan cekemiyosun.
	wt.test();
	//wt.test1(); this is not available cuz default (bu verileri employeeden aliyoruz zaten yukarida 'extend' yaptik
}
}
