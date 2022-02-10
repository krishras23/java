package java;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class TestHelloWorld {

    @Test
    public void TestHello() {
        System.out.println("!!!!Hello Krish!!!!");
    }

    String AdjustCase(String s) {
        return s.toLowerCase();
    }

    @Test
    public void TestStringMethods() {
        Assert.assertTrue("foo".equals("foo"));
        Assert.assertTrue("foo".equals("fo".concat("o")));
        Assert.assertTrue("oo".equals("foo".substring(1)));
        Assert.assertTrue("oo".equals("foo".substring(1)));
        Assert.assertTrue(("foo".length() == 3));
    }


    public void PrintQueue(Queue q) {
        System.out.println("val--" + Integer.parseInt("1"));

        System.out.println(q.size());
        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }

    @Test
    public void TestPQ() {
        PriorityQueue<String> l = new PriorityQueue<>(Comparator.comparingInt(String::length));
        l.add("Kapil");
        l.add("KrishYo");
        l.add("DeeptiIsHer");
        l.add("z");
        PrintQueue(l);
    }

    public class Student {
        private String name;
        private int age;

        public Student(String n, int a) {
            this.name = n;
            this.age = a;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "Student data -- {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @Test
    public void TestPQ2() {
        PriorityQueue<Student> l = new PriorityQueue<>((a, b) -> {
            String aName = a.getName();
            String bName = b.getName();
            aName.compareTo(bName);
            return Integer.compare(a.getName().length(), b.getName().length());
        });
        l.add(new Student("Krish", 16));
        l.add(new Student("Kail", 46));
        l.add(new Student("Anvi", 10));
        PrintQueue(l);
    }

    @Test
    public void TestQueue() {
        LinkedList<String> l = new LinkedList<>();
        l.add("Kapil");
        l.add("Krish");
        l.add("Deepti");

        PrintQueue(l);
    }

    @Test
    public void TestQueueAsStack() {
        LinkedList<String> l = new LinkedList<>();
        l.push("Kapil");
        l.push("Deepti");
        l.push("Krish");


        while (!l.isEmpty()) {
            System.out.println(l.pop());
        }
    }

    private boolean balanceString(String input) {
        Stack<Character> given_str;
        given_str = new Stack();

        for (int i = 0; i < input.length(); i++) {
            char x = (input.charAt(i));
            given_str.push(x);
        }

        System.out.println("ORIGINAL" + given_str);

//        given_str.push(1);
//        given_str.push(2);
//        given_str.push(3);
//        given_str.push(3);
//        given_str.push(2);
//        given_str.push(1);

        Object clone = given_str.clone();

        Stack Stack2 = new Stack();

        while (given_str.size() > 0) {
            Stack2.push(given_str.pop());
        }

        System.out.println("CLONED" + Stack2);
//        for (int i = 0; i < clone.equals()+1; i++) {
////            Stack2.push(given_str.pop());
////        }
//        System.out.println("clone" + clone);
//        System.out.println("stack2" + Stack2);

        if (clone.equals(Stack2)) {
            System.out.println("This is a Balanced String");
        } else {
            System.out.println("No");
        }
        return true; // false
    }

    @Test
    public void TestStack() {
        String input = "{}{}";
        balanceString(input);
    }


    @Test
    public void TestString() {
        String s = "Hello This is Krish";
        System.out.println(AdjustCase(s));
    }

    public void Loop(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    @Test
    public void HashMap(){
        HashMap<String,Integer> frequency = null; new HashMap<>();
        frequency.put("Hello",4);
        System.out.println(frequency);
    }

    @Test
    public void LinkedList(){
        LinkedList<String> nodes = new LinkedList<>();

    }


    @Test
    public void TestForLoop() {
        Loop(2);
        Loop(3);
    }

    @Test
    public void TestSomeStack(){
        LinkedList <String> somestack = new LinkedList <>();
        somestack.push("a");
        somestack.push("b");
        somestack.push("c");
        System.out.println(somestack);
        System.out.println(somestack.get(3));
        boolean x = somestack.isEmpty();
        System.out.println(x);
        somestack.addLast("e");
        somestack.addFirst("first in stack?");
        System.out.println(somestack);
        System.out.println(somestack.pop());
        somestack.stream().toArray();
    }

    @Test
    public void TestDataTypes() {
        int i = 10;
        boolean b = true;
        char ch = 'V';
        System.out.println(ch);
        int x = ch;
        System.out.println(x);
        System.out.println('c' - 'a');

        // "Abc"

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) ((int) ch + 'a' - 'A');
        }
        System.out.println(ch);

        Map<Character, Character> m = new HashMap<>();
        for (char key = 'A', val = 'a'; key <= 'Z'; key++, val++) {
            m.put(key, val);
            m.put(val, key);
        }
        System.out.println(m);
    }

}
