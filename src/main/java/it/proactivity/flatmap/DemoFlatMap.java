package it.proactivity.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMap {
    private String s;
    private List<Integer> integers;
    private List<String> strings;

    public DemoFlatMap(String s, List<Integer> integers, List<String> strings) {
        this.s = s;
        this.integers = integers;
        this.strings = strings;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    private static Boolean stringhePiuLungheDi4eConMo(String s) {
        if (s == null) {
            return false;
        }
        return s.length() > 4 && s.contains("mo");
    }

    public static void main(String[] args) {

        DemoFlatMap obj1 = new DemoFlatMap("Oggetto1", Arrays.asList(1,39,35,9), Arrays.asList("ciao", "come", "va"));
        DemoFlatMap obj2 = new DemoFlatMap("Oggetto2", Arrays.asList(10,3,5,99), Arrays.asList("como", "comodino", "stai"));
        DemoFlatMap obj3 = new DemoFlatMap("Oggetto3", Arrays.asList(19,19,75,8), Arrays.asList("cane", "gatto"));
        DemoFlatMap obj4 = new DemoFlatMap("Oggetto4", Arrays.asList(20,31,36,24), Arrays.asList("ciambella", "pollo", "cipolle", "aglio"));
        DemoFlatMap obj5 = new DemoFlatMap("Oggetto5", Arrays.asList(123,12,5,44), Arrays.asList("cosmologia", "oroscopo", "osmosi"));

        DemoFlatMap obj6 = new DemoFlatMap("Oggetto6", Arrays.asList(123,125,6665,4434), Arrays.asList("cosmologia", "oroscopo", "osmosi"));
        DemoFlatMap obj7 = new DemoFlatMap("Oggetto7", Arrays.asList(1,12,5,44), Arrays.asList("cosmologia", "oroscopo", "osmosi"));
        DemoFlatMap obj8 = new DemoFlatMap("Oggetto8", Arrays.asList(1231,112,1115,11144), Arrays.asList("cosmologia", "oroscopo", "osmosi"));
        DemoFlatMap obj9 = new DemoFlatMap("Oggetto9", Arrays.asList(1203,102,50,4400), Arrays.asList("cosmologia", "oroscopo", "osmosi"));
        DemoFlatMap obj10 = new DemoFlatMap("Oggetto10", Arrays.asList(100023,100002,50000,44000), Arrays.asList("cosmologia", "oroscopo", "osmosi"));
        DemoFlatMap obj11 = new DemoFlatMap("Oggetto11", Arrays.asList(1,0,5,4), Arrays.asList("cosmologia", "oroscopo", "osmosi"));

        List<DemoFlatMap> demoFlatMaps = new ArrayList<>();
        demoFlatMaps.add(obj1);
        demoFlatMaps.add(obj2);
        demoFlatMaps.add(obj3);
        demoFlatMaps.add(obj4);
        demoFlatMaps.add(obj5);
        demoFlatMaps.add(obj6);
        demoFlatMaps.add(obj7);
        demoFlatMaps.add(obj8);
        demoFlatMaps.add(obj9);
        demoFlatMaps.add(obj10);
        demoFlatMaps.add(obj11);

        // anymatch == almeno un elemento che rispetta il mio predicato
        // allmatch == tutti gli elementi rispettano il mio predicato
        // nonematch == nessun elemento rispetta il mio predicato

        boolean allMatchCondition = demoFlatMaps.stream().map(s -> s.getStrings()).flatMap(List::stream)
                .allMatch(x -> x.length() > 0);
        System.out.println(allMatchCondition);




        List<String> stringList = demoFlatMaps.stream()
                .map(s -> s.getStrings())
                .flatMap(List::stream)
                .filter(s -> stringhePiuLungheDi4eConMo(s))
                .collect(Collectors.toList());

        /*
        for (String s1 : stringList) {
            System.out.println(s1);
        }
        */
    }
}






