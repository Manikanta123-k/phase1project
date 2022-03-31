package project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class phase1project {
	public static void main(String[] args) throws IOException {
		int catlouge;
		int module;
		 Scanner m = new Scanner(System.in);
		while(true)
		{
		 System.out.println("enter 5 to display in asc order,enter 6 for module,enter 7 to exit");//
		catlouge=m.nextInt();
		switch(catlouge)
		{
		case 5:
			 String path="D:\\mywork\\";
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
					}
				break;
		case 6:
		 Scanner m1 = new Scanner(System.in);
		 
		 boolean z=true;
		while(z){
			System.out.println("enter 55 to add file,enter 66  to delete,enter 77 to search,enter 88 to go to menu");
			module=m1.nextInt();
			switch(module)
		   {
		   case 55:
			   String path1="D:\\mywork";
				Scanner m2=new Scanner(System.in);

				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("enter the file name to create");
				String filename1=m2.next();
				String finalname1=path1+filename1;
				System.out.println(finalname1);

				//create a file 

				File f1=new File(finalname1);
				boolean z1=f1.createNewFile();
				if(z!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename1);
					System.out.println("file created");
					break;
				}

				System.out.println("the collection of files is "+ al);
				}
		 			break;
		 		case 66:
		 			String path2="D:\\mywork";
		 			Scanner m3=new Scanner(System.in);
		 			System.out.println("enter the file name to be deleted");
		 			String filname2=m3.next();
		 			String finalfile=path2+filname2;
		 			File file=new File(finalfile);
		 			file.delete();
		 			System.out.println("file deleted");
		 			break;
           case 77:
			   String path3="D:\\mywork";
				File f2=new File(path3);
				Scanner m4=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname=m4.next();
				File filename3[]=f2.listFiles();
				int flag=0;
				for(File ff:filename3) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
					}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
			break;
		   
			case 88:
				z=false;
				
		   }}break;
	      case 7:
			   System.exit(0);
			   break;
		}
		}
	}
}


	