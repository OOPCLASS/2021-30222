package model;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello");

        List<Pair<Integer, Integer>> pairList = new LinkedList<>();
        pairList.add(0, new Pair<>(10, 89));
        pairList.add(1, new Pair<>(12, 13));
        pairList.add(2, new Pair<>(19, 97));
        pairList.add(3, new Pair<>(10, 36));

        System.out.println(pairList.get(1).getLeft());

        pairList.remove(2);

        pairList.set(2, new Pair<>(22, 33));

        for (Pair<Integer, Integer> pair : pairList) {
            System.out.println(pair.getLeft() + " " + pair.getRight());
        }

        Set<Pair<String, String>> pairSet = new HashSet<>();
        pairSet.add(new Pair<>("Ana", "Popescu"));
        pairSet.add(new Pair<>("Maria", "Ionescu"));
        pairSet.add(new Pair<>("Anastasia", "Georgescu"));


        for (Pair<String, String> pair : pairSet) {
            if (pair.equals(new Pair<>("Ana", "Popescu"))) {
                System.out.println("gasit");
            }
        }

        Iterator<Pair<String, String>> iterator = pairSet.iterator();

        while (iterator.hasNext()) {
            Pair<String, String> pair = iterator.next();
            if (pair.equals(new Pair<>("Ana", "Popescu"))) {
                iterator.remove();
            }
        }

        Iterator<Pair<String, String>> iterator2 = pairSet.iterator();
        while (iterator2.hasNext()) {
            Pair<String, String> pair = iterator2.next();
            if (pair.equals(new Pair<>("Maria", "Ionescu"))) {
                pair.setLeft("Ramona");
                pair.setRight("Martin");
            }
        }

        for (Pair<String, String> pair : pairSet) {
            System.out.println(pair.getLeft() + " " + pair.getRight());
        }

        Map<Integer, Pair<Integer, Integer>> pairMap = new HashMap<>();
        pairMap.put(22, new Pair<>(11, 33));
        pairMap.put(33, new Pair<>(22, 44));
        pairMap.put(44, new Pair<>(33, 55));

        System.out.println(pairMap.get(22).getLeft() + " " + pairMap.get(22).getRight());

        pairMap.remove(22);

        pairMap.put(33, new Pair<>(12, 21));

        for (Integer i : pairMap.keySet()) {
            System.out.println(i + " " + pairMap.get(i).getLeft() + " " + pairMap.get(i).getRight());
        }

        /////////////////////////////////////////////////////////////////////////////////////////////

        User user1 = new User("Ramona Martin", 20);
        User user2 = new User("Bianca Fabian", 19);
        User user3 = new User("Catalin Cardos", 20);

        List<Address> list1 = new LinkedList<>();
        list1.add(0, new Address("Oradea", "Plopilor", 23));
        list1.add(1, new Address("Deva", "Plopilor", 78));

        List<Address> list2 = new LinkedList<>();
        list2.add(0, new Address("Brad", "Horea", 48));
        list2.add(1, new Address("Deva", "Plopilor", 78));

        List<Address> list3 = new LinkedList<>();
        list3.add(0, new Address("Baia Mare", "Avram Iancu", 3));
        list3.add(1, new Address("Cluj", "Zefirului", 45));

        Map<User, List<Address>> database = new HashMap<>();
        database.put(user1, list1);
        database.put(user2, list2);
        database.put(user3, list3);

        List<Address> wantedList = database.get(new User("Ramona Martin", 20));
        for (int i = 0; i < wantedList.size(); i++) {
            System.out.println(wantedList.get(i).getCity() + " "
                    + wantedList.get(i).getStreet() + " " +
                    wantedList.get(i).getNumber());
        }
        System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////

        Set<Address> addressSet = new HashSet<>();
        database.forEach((k, v) -> {
            List<Address> listOfAddresses = database.get(k);
            for (int i = 0; i < listOfAddresses.size(); i++) {
                addressSet.add(listOfAddresses.get(i));
            }
        });

        for (Address address : addressSet) {
            System.out.println(address.getCity()+" "+address.getNumber()+" "+address.getStreet());
        }

        ArrayList<String> listTest = new ArrayList<>();
        listTest.add(0,"Ramona");
        listTest.remove("Ramona");


    }
}
