/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        initialize();
        boolean run = true;
        while (run) {
            System.out.flush();
            printMenu();
            String option;
            Scanner in = new Scanner(System.in);
            option = in.nextLine().trim();//avoid using int because you are not catching
           
            if (option.equals("1")) {
                ListTraders();
            } else if (option.equals("2")) {
                SelectTrader();
            } else if (option.equals("3")) {
                SearchLocations();
            } else if (option.equals("4")) {
                SearchServices();
            } else if (option.equals("0")) {
                run = false;
                exit(0);
            } else {
                System.out.println("Invalid Option Try again");
            }
        }

    }

    public static void printMenu() {
        System.out.println("Please select an option");
        System.out.println("List traders.........1");
        System.out.println("Select trader........2");
        System.out.println("Search Locations.....3");
        System.out.println("Search Services......4");
        System.out.println("Exit.................0");
    }

    public static void initialize()
    {
        traders = new LinkedList<Trader>();
        String dir = System.getProperty("user.dir");
        readFile(dir+"\\src\\traders.txt");
    }
    public static void SearchServices() {
        System.out.println("Enter search text");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().trim();
        
        Trader tarr[] = traders.toArray(new Trader[traders.size()]);
        int id = 0;
        
        boolean found = false;
        
        for(Trader trader : tarr)
        {
            id++;
            if(trader.getServices().toLowerCase().contains(text.toLowerCase()))
            {
                if(found == false)
                {
                    String formattedheader = String.format("|%1$-5s |%2$-25s |%3$-25s |%4$-65s|","ID","Company Name",
                        "Location", "Services");
                    System.out.println(formattedheader);
                    found = true;
                }
                //Get that trader
                String formatted = String.format("|%1$-5s |%2$-25s |%3$-25s |%4$-65s|",id,trader.companyName,
                        trader.location, trader.services);
                /*System.out.println(id+" | "+
                        trader.companyName+" | "+
                        trader.location +" | "+
                        trader.services+" | "
                );*/
                System.out.println(formatted);
                
            }
        }
        if(found == false)
        {
            System.out.println("The service was not found");
        }
        
    }

    public static void SearchLocations() {
        System.out.println("Enter search text");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().trim();
        
        Trader tarr[] = traders.toArray(new Trader[traders.size()]);
        int id = 0;
        for(Trader trader : tarr)
        {
            id++;
            if(trader.getLocation().toLowerCase().contains(text.toLowerCase()))
            {
                //Get that trader
                System.out.println(id+" | "+
                        trader.companyName+" | "+
                        trader.location +" | "+
                        trader.services+" | "
                );
                
            }
        }
        
        
    }

    public static void ListTraders() {
        System.out.println("Traders...............................");
        if(traders.isEmpty()) System.out.println("No traders");
        for(Trader t : traders)
        {
            System.out.println(t.toString());
        }
        
    }

    public static void SelectTrader() {
        System.out.println("Enter trader ID from list(1-25) :");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine().trim());
        if(number > 25 || number <1){
            System.out.println("Invalid option Please enter value between 1 and 25");
            SelectTrader();
            return;
        }
        Trader tarr[] = traders.toArray(new Trader[traders.size()]);
        Trader trader = tarr[number-1];
        System.out.println(trader.toString());
    }

    public static Queue<String> readFile(String filepath) {
        File file = new File(filepath);
        Queue<String> returndata = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File at " + filepath + " does not exist");
            }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            returndata = new LinkedList();
            String st;
            while ((st = br.readLine()) != null) {
                returndata.add(st);//add the line to the queue
                //split the data
                String datas[] = st.trim().split(":");
                Trader trader = new Trader(datas[0],datas[1],datas[2],Integer.parseInt(datas[3].trim()),Double.parseDouble(datas[4].trim()),datas[5]);
                traders.add(trader);
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return returndata;

    }

    public static class Trader {

        private String companyName;
        private String location;
        private String services;
        private Integer numEmployees;
        private Double dailyRate;
        private String descritpion;

        public Trader(String companyName, String location, String services,
                Integer numEmployees, Double dailyRate, String description) {
            this.companyName = companyName;
            this.location = location;
            this.services = services;
            this.numEmployees = numEmployees;
            this.dailyRate = dailyRate;
            this.descritpion = description;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getServices() {
            return services;
        }

        public void setServices(String services) {
            this.services = services;
        }

        public Integer getNumEmployees() {
            return numEmployees;
        }

        public void setNumEmployees(Integer numEmployees) {
            this.numEmployees = numEmployees;
        }

        public Double getDailyRate() {
            return dailyRate;
        }

        public void setDailyRate(Double dailyRate) {
            this.dailyRate = dailyRate;
        }

        public String getDescritpion() {
            return descritpion;
        }

        public void setDescritpion(String descritpion) {
            this.descritpion = descritpion;
        }
        
        @Override
        public  String toString()
        {
            String output = "";
            output += "Company Name: "+this.companyName +
                    "\nLocation: "+this.location+
                    "\nServices: "+this.services+
                    "\nNumber of Employees: "+this.numEmployees+
                    "\nDaily Rate: "+this.dailyRate+
                    "\nDescription: "+this.descritpion;
            return output;
        }

    }
    
    private static Queue<Trader> traders;
}
