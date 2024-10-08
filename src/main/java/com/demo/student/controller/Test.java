// package com.demo.student.controller;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// import javax.management.MBeanException;
// import javax.sql.rowset.spi.SyncResolver;
// import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
// import com.google.gson.Gson;
// import com.google.gson.reflect.TypeToken;


// public class Test{
//     public static void main(String[] args) {
  

//         List<String> cars = new ArrayList<String>();
//         cars.add("BMW");
//         cars.add("Audi");
//         cars.add("Benz");
//         cars.forEach(car->System.out.println(car));

//         ArrayList<Integer> al = new ArrayList<Integer>(); 
  
//         // Inserting elements to ArrayList class object 
//         // Custom input integer numbers 
//         al.add(2); 
//         al.add(6); 
//         al.add(9); 
//         al.add(4); 
//         al.add(20); 

//         Map<String, String> colors = new HashMap<String,String>();
//         colors.put("1", "Red");
//         colors.put("2","Orange");
//         colors.put("3","Yellow");

//         Iterator itr = colors.keySet().iterator();

//         while(itr.hasNext()){
//             System.out.println(colors.get(itr.next()));   
//         }

//         ConcurrentHashMap<Integer, String> car = new ConcurrentHashMap<>();
//         car.put(1, "Tata");
//         car.put(2, "Maruthi");

//         Iterator itra = car.keySet().iterator();

//         while(itra.hasNext()){
//             System.out.println(car.get(itra.next()));
//         }

//         for(String carx:cars){
//             System.out.println(carx);
//         }

//         cars.stream().forEach(System.out::println);

//         System.out.println("Streams");
//         cars.stream().filter((s)->s.startsWith("B")).forEach(System.out::println);

//         cars.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

//        // al.stream().filter(s-> s< 10).forEach(System.out::println);

//         List<Integer> num = al.stream().filter(s-> s<=10).collect(Collectors.toList());

//         System.out.println(num);


//         List<Integer> values = new ArrayList<>();
//         values.add(10);
//         values.add(20);
//         values.add(30);
//         values.add(40);
//         values.add(50);

//         for (Integer val:values){
//             System.out.println(val);
//         }

//         List<Integer> valuesA = values.stream().filter(s->s >= 30).collect(Collectors.toList());

//         System.out.println(values.stream().min((i,j)->i.compareTo(j)));

//         System.out.println(values.stream().max((i,j)->i.compareTo(j)));

//         System.out.println(valuesA);

//         List<String> memberNames = new ArrayList<>();
//         memberNames.add("Amitabh");
//         memberNames.add("Shekhar");
//         memberNames.add("Aman");
//         memberNames.add("Rahul");
//         memberNames.add("Shahrukh");
//         memberNames.add("Salman");
//         memberNames.add("Yana");
//         memberNames.add("Lokesh");

//         List<String> mems = memberNames.stream().filter(s->s.startsWith("S")).map(String::toUpperCase).collect(Collectors.toList());

//         memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

//         System.out.println(mems);

//         Boolean memA = memberNames.stream().anyMatch(s->s.startsWith("A"));
//         Boolean memB = memberNames.stream().allMatch(s->s.startsWith("A"));
//         Boolean memC = memberNames.stream().noneMatch(s->s.startsWith("W"));
        
//         System.out.println(memA);
//         System.out.println(memB);
//         System.out.println(memC);

//         System.out.println(memberNames.stream().filter(s->s.startsWith("A")).findFirst().get());


//         //JAVA 11 Features 

//         System.out.println("Java 11 features");

//         String str1 = "";
//         System.out.println(str1.isBlank());
 
//         String str2 = "GeeksForGeeks";
//         System.out.println(str2.isBlank());
//         System.out.println(str2.strip());

//         String str = "Geeks\nFor\nGeeks";
//         System.out.println(str.lines().collect(Collectors.toList()));

//         var xyz = 20;

//         System.out.println(String.valueOf(xyz));

//         var name = memberNames.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
//         System.out.println(name);

//         String acctNo;
//         String wallets = "{\"AC\":\"0460385313\",\"PW\":\"660000004312\"}";
//         System.out.println("Java 11 features"+wallets);
      
            

//     }
// }