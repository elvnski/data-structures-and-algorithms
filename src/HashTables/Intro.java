package HashTables;

import java.util.Hashtable;

public class Intro {

    public static void main(String[] args) {

        Hashtable<Integer, String>table = new Hashtable<>(10, 0.5f);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        table.put(111, "Mr. Krabs");


        for (Integer key : table.keySet()) {
            System.out.println(key + "\t" + table.get(key));
        }


        /* Removing elements */
        table.remove(111);

        for (Integer key : table.keySet()) {
            System.out.println("Index:" + key.hashCode() % 10 + "\t" + "Hashcode: " + key.hashCode() + "\t" + "Key: " + key + "\t" + table.get(key));
        }


        //For String Kays
        Hashtable<String, String> table2 = new Hashtable<>(10, 0.5f);

        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");
        table2.put("111", "Mr. Krabs");

        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>> TABLE 2 <<<<<<<<<<<<<<<<<<<<<<<< \n\n");
        for (String key : table2.keySet()) {
            System.out.println("Index:" + key.hashCode() % 10 + "\t" + "Hashcode: " + key.hashCode() + "\t" + "Key: " + key + "\t" + (String) table2.get(key));
        }


    }


}
