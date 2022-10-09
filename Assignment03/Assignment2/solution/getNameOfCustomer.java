package corejava.collection.assignmentset3.Assignment03.Assignment2.solution;

import corejava.collection.assignmentset3.Assignment03.Assignment2.model.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class getNameOfCustomer {
    private List<Customer> customerArrayList;

    public  getNameOfCustomer(List<Customer> studentArrayList ) {

        this.customerArrayList=studentArrayList;
    }

    public  Map<String,Integer> findProductNameAndMaxPrice() {
        Map<String, Integer> myMaxMap = customerArrayList.stream()
                .collect(Collectors
                        .groupingBy(Customer::getProductName, Collectors
                                .collectingAndThen(Collectors
                                        .maxBy(Comparator.comparingInt(Customer::getPrice)), e->e.map(Customer::getPrice).orElse((int) -1))));

        return myMaxMap;
    }
    public  Map<String,Integer> findProductNameAndLowPrice() {
        Map<String, Integer> myminMap = customerArrayList.stream()
                .collect(Collectors
                        .groupingBy(Customer::getProductName, Collectors
                                .collectingAndThen(Collectors
                                        .minBy(Comparator.comparingInt(Customer::getPrice)), e->e.map(Customer::getPrice).orElse((int) -1))));
        return myminMap;
    }
    public void findCustomerName(List<Customer>customerArrayList, Map<String,Integer>myMaxMap, Map<String,Integer>myminMap){
        List<String>set=customerArrayList.stream().filter(
                value->myMaxMap.containsKey(value.getProductName()) && value.getPrice() < myMaxMap.get(value.getProductName()) && value.getPrice()==myminMap.get(value.getProductName())).map(Customer::getCustomerName).collect(Collectors.toList());
        for(String s:set)
        {
            System.out.println(s);
        }
    }

}


