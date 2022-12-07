package com.revature.app;
import java.util.Scanner;



import com.revature.repository.AccountRepository;
import com.revature.repository.JdbcAccountRepository;
//import com.example.repository.TxnRepository;
//import com.example.repository.TxnRepositoryImpl;
import com.revature.service.TxrService;
import com.revature.entity.AccDetails;
import com.revature.entity.TDetails;


public class App {
	public static void main(String[] args) {
		AccountRepository AccountRepository =new JdbcAccountRepository();
		
		Scanner input = new Scanner(System.in);
		while(true)
		{	
			System.out.println("Press 1 for Hotel Booking");
			System.out.println("Press 2 ");
			int option = input.nextInt();
			if(option!=0) {
			switch(option) {
			case 1:{
				AccountRepository accountRepository =new JdbcAccountRepository();
				System.out.println("Press 1 to register");
				System.out.println("Press 2 for TDetails");
				System.out.println("Press 3 for accountdetails");
				System.out.println("Press 4 for edit");
				System.out.println("Press 0 for exit");
				Scanner s=new Scanner(System.in);
				int i = s.nextInt();
				switch(i) {
					case 1:
						System.out.println("Enter Name");
						String name = input.next();
						System.out.println("Enter Mail");
						String mail = input.next();
						System.out.println("Enter paswword");
						String pw = input.next();
						System.out.println("Enter phone");
						String phone = input.next();
						System.out.println("Enter address");
						String address = input.next();
						AccDetails accdetails =new AccDetails();
						accountRepository.save(accdetails);
						break;
						
					case 2:
						System.out.println("Enter Mail");
						String ma = input.next();
						System.out.println("Enter paswword");
						String pw1 = input.next();
						TDetails tdetails=new TDetails(ma,pw1);
						accountRepository.save(tdetails);
						break;
				
				case 3:
				{
					System.out.println("Enter  id (0 For all account )");
					int n1=input.nextInt();
					accountRepository.getAccDetails(n1).forEach(Accdetails->System.out.println(Accdetails));
					break;
				}
				case 4:
				{
					System.out.println("Enter name");
					String n1=input.next();
					AccountRepository.edit(n1);
					break;
				}
				
			}
			}
			}
			 
			
		}
			

		}	
	}
}

