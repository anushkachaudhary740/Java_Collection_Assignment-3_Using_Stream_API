package corejava.collection.assignmentset3.Assignment03.Assignment2.main;
import corejava.collection.assignmentset3.Assignment03.Assignment2.model.Customer;
import corejava.collection.assignmentset3.Assignment03.Assignment2.solution.getNameOfCustomer;
import corejava.collection.assignmentset3.Assignment03.Assignment2.parser.CustomerParser;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            CustomerParser inputParser = new CustomerParser();
            // For using CSV file
            String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment2/inputfile/fileinput.csv";
            List<Customer> customerArrayList = inputParser.parseCSvFile(filePath);
            getNameOfCustomer om = new getNameOfCustomer(customerArrayList);
            Map myMap = om.findProductNameAndPrice();
            Map myMinMap=om.findProductNameAndLowPrice();
            om.customerName(customerArrayList,myMap,myMinMap);
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
