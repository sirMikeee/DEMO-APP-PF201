
package demo.app.pf201;

import java.util.Scanner;


public class DEMOAPPPF201 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do{
                System.out.println("\n---------------------------------------");
                System.out.println("WELCOME TO APP DEMO");
                System.out.println("");
                System.out.println("1. CUSTOMER");
                System.out.println("2. PRODUCT");
                System.out.println("3. ORDER");
                System.out.println("4. REPORTS");
                System.out.println("5. EXIT");

                System.out.print("Enter action: ");
                int action = sc.nextInt();

                switch(action){
                    case 1:
                        Customer cs = new Customer();
                        cs.cTransaction();
                        break;
                        
                    case 5: 
                        System.out.print("Exit Selected... type 'yes' to continue: ");
                        String resp = sc.next();
                        if(resp.equalsIgnoreCase("yes")){
                            exit = false;
                        }
                        break;
                    

                }
        }while(exit);
    }
    
}
