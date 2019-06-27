package com.Class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer>classroomMap=new LinkedHashMap<>();
		classroomMap.put("Table", 20);
		classroomMap.put("Chair", 60);
		classroomMap.put("Screen", 3);
		classroomMap.put("Student", 60);
		classroomMap.put("Instructor", 3);
		
		System.out.println(classroomMap);
		
		//take an output parantezsiz
		for (Map.Entry<String, Integer> entry:classroomMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("///////////////////////////////////////////////////");
		
		Iterator<Map.Entry<String, Integer>> classRoomIterator=classroomMap.entrySet().iterator();
		while(classRoomIterator.hasNext()) {
			Map.Entry<String, Integer> me=classRoomIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
