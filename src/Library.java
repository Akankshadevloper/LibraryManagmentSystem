import College.book;

import java.util.Scanner;

public class Library {

  Scanner input = new Scanner(System.in);


        System.out.println(
                "********************Welcome to the Library Managment System ********************");
        System.out.println(
                "				 Select From The Following Options:			 ");
        System.out.println(
                "**********************************************************************");
        
        books ob = new books();
        
        students obStudent = new students();

        int choice;
        int searchChoice;
      
        do {

            ob.dispMenu();
            choice = input.nextInt();



  

}
