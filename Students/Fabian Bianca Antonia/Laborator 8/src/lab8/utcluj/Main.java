package lab8.utcluj;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Pair<String> firstPair = new Pair<>("left","right");
        Pair<String> secondPair = new Pair<>("left1","right1");
        User firstUser = new User("Ramona");
        Address firstAddress = new Address("Brad","Muzeului",10);
        ArrayList<Address> first = new ArrayList<>();
        first.add(firstAddress);
        User secondUser = new User("Catalin");
        Address secondAddress = new Address("Baia Mare","Stefan cel Mare",40);
        ArrayList<Address> second = new ArrayList<>();
        second.add(secondAddress);
        User thirdUser = new User("Alexandru");
        Address thirdAddress = new Address("Baia Mare","Republicii",25);
        Address fourthAddress = new Address("Baciu","Privighetorii",15);
        ArrayList<Address> third = new ArrayList<>();
        third.add(thirdAddress);
        third.add(fourthAddress);
        third.add(secondAddress);


        List<Pair> listOfPairs= new ArrayList<>();
        listOfPairs.add(firstPair);
        listOfPairs.add(secondPair);
        for (int i = 0; i < listOfPairs.size(); i++)
        {
            System.out.println(listOfPairs.get(i));
        }
        listOfPairs.remove(secondPair);
        System.out.println();
        for (int i = 0; i < listOfPairs.size(); i++)
        {
            System.out.println(listOfPairs.get(i));
        }

        listOfPairs.set(0,new Pair<String> ("right","left"));

        for (int i = 0; i < listOfPairs.size(); i++)
        {
            System.out.println(listOfPairs.get(i));
        }

        System.out.println();

        Map<User,ArrayList<Address>> myMap = new HashMap<>();
        myMap.put(firstUser,first);
        myMap.put(secondUser,second);
        myMap.put(thirdUser,third);

       ArrayList<Address> results = myMap.get(thirdUser);
        for (int i = 0; i < results.size(); i++)
        {
            System.out.println(results.get(i));
        }
        System.out.println();
        Set<Address> mySet = new HashSet<>();
        for (ArrayList<Address> addresses: myMap.values())
        {
            for(Address address: addresses)
            {
                mySet.add(address);
            }
        }

       for(Address address: mySet)
       {
           System.out.println(address);
       }
    }
}
