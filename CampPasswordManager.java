import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.lang.System;

import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean[] reqCheckList = {false,false,false,false};

        boolean userCreation=false;
        
        ArrayList <Integer> specialCharacters = new ArrayList<Integer>();
        ArrayList <String> passwordList = new ArrayList<String>();

        ArrayList <String> firstName = new ArrayList<String>();
        ArrayList <String> lastName = new ArrayList<String>();
        ArrayList <String> username = new ArrayList<String>();
        ArrayList <String> passwords = new ArrayList<String>();

        ArrayList <String> home = new ArrayList<String>();
        ArrayList <String> entertainment = new ArrayList<String>();
        ArrayList <String> work = new ArrayList<String>();
        ArrayList <String> bills = new ArrayList<String>();


        int loginTries = 5;

        ArrayList <String> category = new ArrayList<String>();
        category.add("home");
        category.add("work");
        category.add("entertainment");
        category.add("bills");

        while(userCreation!=true){  
          System.out.println("Are you a new user (y or n): ");
          String yesOrNo = sc.nextLine();
          if (yesOrNo.equals("y") || yesOrNo.equals("yes")) {
            newUser(reqCheckList, username, passwords, firstName, lastName);
          }
          else if (yesOrNo.equals("n") || yesOrNo.equals("no")){
               login(username,passwords);
               userCreation=true;
          }
        }
        catagoryNavagation(category);
        
        
    }

    private static void newUser(boolean[] cl, ArrayList <String> u, ArrayList <String> p,ArrayList <String> f, ArrayList <String> l ){
        Scanner newUser = new Scanner(System.in);
        System.out.println("What is your first name: ");
        String firstName = newUser.nextLine();
        f.add(firstName);
        System.out.println("What is your last name: ");
        String lastName = newUser.nextLine();
        l.add(lastName);
        System.out.println("What is your username: ");
        String userUsername = newUser.nextLine();
        u.add(userUsername);
        System.out.println("What is your password (Symbols can only be 1-0 Shift): ");
        String userPassword = newUser.nextLine();
        passwordChecker(cl, userPassword);
        p.add(userPassword);
        
    }

    private static void login(ArrayList <String> u, ArrayList <String> p){
        Scanner login = new Scanner(System.in);
        boolean loginChecker=false;
        int loginTries = 5;
        while(loginTries!=0){
            System.out.println("Input your username: ");
            String username=login.nextLine();
            System.out.println("Input your password: ");
            String password=login.nextLine();
            if( p.contains(password)&&(u.contains(username))){
                int pindex=p.indexOf(password);
                int uindex=u.indexOf(username);
                if(pindex==uindex){
                    System.out.println("Login Succesful");
                    break;
                    
                }
            }
            else{
                System.out.println("Incorrect Information, Try Again");
                loginTries-=1;
            }
        }
        if(loginTries==0){
            System.out.println("0 tries remaining, we are calling the police");
            System.exit(0);
        }
    }

    private static void passwordChecker(boolean[] cl,String p){
        Scanner ui = new Scanner(System.in);
        String[] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] numbers={"1","2","3","4","5","6","7","8","9","0"};
        String[] symbols={"!","@","#","$","%","^","&","*","(",")"};
        String password=p.toString();
        System.out.println(password);
        System.out.println(password.length());
        if (password.length()>=8) {
            cl[0]=true;
            for(int i=0; i<alphabet.length; i++){
                if(password.contains(alphabet[i])){
                    cl[1]=true;
                }
            }
            for(int i=0; i<numbers.length; i++){
               if(password.contains(numbers[i])){
                    cl[2]=true;
                }
            }
            for(int i=0; i<symbols.length; i++){
                if(password.contains(symbols[i])){
                    cl[3]=true;
                }
            }
            for(boolean value: cl){
                if(value==false){
                  System.out.println("Password doesn't meet requirements, try again");
                  System.out.println("Enter a password ");
                  password=ui.nextLine();

                }
                else{
                  System.out.println("Password is good");
                  break;
                }
            }
        }
    }

    public static void catagoryNavagation(ArrayList <String> c){
      Scanner nav = new Scanner(System.in);
      boolean navLoop=false;
      while(navLoop!=true){
        System.out.println("Would you like to add or view a catagory, type stop to end the program ");
        String cata = nav.nextLine();
          if(cata.equals("add")){
            System.out.println("What is this catagory called ");
            String navAdd = nav.nextLine();
            c.add(navAdd);
          }
          else if(cata.equals("view")){
            System.out.println(c);
          }  
        if(cata.equals("stop")){
          navLoop=true;
          System.exit(0);
        }
      }

    }

    private static void printArray(int[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.println(listy[i]);
        }
    }
    
    private static void printArray(double[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    
    private static void printArray(String[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }
    
    private static void printArray(boolean[] listy){
        for (int i=0; i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }

    private static int getRandInt(int minimum, int maximum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}
