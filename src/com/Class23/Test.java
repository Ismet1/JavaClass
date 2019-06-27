package com.Class23;

public class Test {
	//employee'ye bagli class
	
	public static void main(String[] args) {
		//bu class i execution icin kullaniyoruz
		System.out.println("-------------creating employee object-----------");
		Employee emp = new Employee(); //diger siniftaki verileri object ile call edicez. Cunku static degil.Static olsaydi class uzrinden.
		System.out.println(Employee.department);//buda static , o yuzden employee yazarak call ettik.
		Employee.work(); //static memberslari bu sekilde call ediyoruz(class name ile)
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("-------------creating scrumteam object-----------");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.work();
		System.out.println(st.salary);
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		
		System.out.println("-------------creating developer object-----------");
		Developer dev = new Developer();
		Developer.work();//static bilgi. o yuzden full developer yazdik basina
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		dev.attendScrumMeetings();
		dev.workOnArtifacts();
		dev.code();
		
		
		System.out.println("-------------creating tester object-----------");
		Tester qa = new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		qa.attendScrumMeetings();
		qa.workOnArtifacts();
		qa.test();
		
		
		System.out.println("-------------creating bussiness analyst object-----------");
		BussinessAnalyst ba = new BussinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog";
		ba.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		ba.attendScrumMeetings();
		ba.workOnArtifacts();
		ba.writeUserStories();
		
		
		System.out.println("-------------creating Scrum Master object-----------");
		ScrumMaster sm = new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		sm.attendScrumMeetings();
		sm.workOnArtifacts();
		sm.driveScrumMeetings();
		
		
		System.out.println("-------------creating Product Owner object-----------");
		ProductOwner po = new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, product backlog";
		po.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		po.attendScrumMeetings();
		po.workOnArtifacts();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		
		System.out.println("-------------creating  frontend developer object-----------");
		FrontEnd fe = new FrontEnd();
		fe.salary=125000;
		fe.getPaid();
		fe.artifacts="Sprit backlog";
		fe.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		fe.attendScrumMeetings();
		fe.workOnArtifacts();
		fe.code();
		fe.doHtml();
		
		
		System.out.println("-------------creating  backend developer object-----------");
		BackEnd be = new BackEnd();
		be.salary=125000;
		be.getPaid();
		be.artifacts="Sprit backlog";
		be.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		be.attendScrumMeetings();
		be.workOnArtifacts();
		be.code();
		be.doSql();
		
		
		System.out.println("-------------creating manual tester object-----------");
		ManualTester ma = new ManualTester();
		ma.salary=95000;
		ma.getPaid();
		ma.artifacts="Sprit backlog";
		ma.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		ma.attendScrumMeetings();
		ma.workOnArtifacts();
		ma.test();
		ma.testManually();
		
		
		System.out.println("-------------creating automation tester object-----------");
		AutomationTester at = new AutomationTester();
		at.salary=105000;
		at.getPaid();
		at.artifacts="Sprit backlog";
		at.ceremonies="Sprit grooming, Sprint planning, Daily StandUp, Sprint Demo";
		at.attendScrumMeetings();
		at.workOnArtifacts();
		at.test();
		at.codeInJava();
	}

}
