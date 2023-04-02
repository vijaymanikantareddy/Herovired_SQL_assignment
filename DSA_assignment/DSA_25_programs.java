1)
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
           int a[]=new int[n]; 
           for(int i=0;i<n;i++)
           a[i]=scan.nextInt();
        scan.close(); 
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


2)
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String[][] mat = new String[6][6];

        for(int i=0;i<6;i++) {
            mat[i] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        }
        bufferedReader.close();
           
        int max=Integer.MIN_VALUE;
        for(int g=0;g<4;g++) {
            for(int h=0;h<4;h++) {
                int sum=0;
                for(int i=g;i<g+3;i++) {
                    for(int j=h;j<h+3;j++) {
                        if(i!=g+1) {
                            sum+=Integer.parseInt(mat[i][j]);
                        }
                        else if(j==h+1){
                            sum+=Integer.parseInt(mat[i][j]);
                        }
                        
                    }
                }
                if(sum>max) max=sum;
            }
        }   
        System.out.println(max);
    }        
}
3)JavaSubarray


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 	  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        int countNegative = 0;
        for(int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = i; j < n; j++) {
               ans += arr[j];
               if (ans < 0) {
                   countNegative++;
               }
           }
        }
        System.out.println(countNegative);
    }
}

4)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> listOfArrays = new ArrayList<ArrayList<Integer>>();
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter ammount of lines: ");
    int n = sc.nextInt();//nr of lines
    for(int i = 0; i<n; i++){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // System.out.print("enter ammount of integers: ");
        int d = sc.nextInt();
        for(int j = 0;j<d;j++){
            int a = sc.nextInt();
            list.add(a);
        }
        listOfArrays.add(list);
    }
   
    int q = sc.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
       
        x = sc.nextInt();

        y = sc.nextInt();
        try{
           System.out.println(listOfArrays.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
    }
}
5)
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
    int n = game.length;
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[n];
    queue.add(0);
    visited[0] = true;
    while (!queue.isEmpty()) {
      int current = queue.poll();
      if (current == n - 1 || current + leap >= n) {
        return true;
      }
      if (current - 1 >= 0 && game[current - 1] == 0 && !visited[current - 1]) {
        queue.add(current - 1);
        visited[current - 1] = true;
      }
      if (current + 1 < n && game[current + 1] == 0 && !visited[current + 1]) {
        queue.add(current + 1);
        visited[current + 1] = true;
      }
      if (current + leap < n && game[current + leap] == 0 && !visited[current + leap]) {
        queue.add(current + leap);
        visited[current + leap] = true;
      }
    }
    return false;
  }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
6)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(in.nextInt());
        }
        
        int queries = in.nextInt();
        for (int l = 0; l < queries; l++) {
            String query = in.next();
            
            switch (query) {
                case "Insert":
                    int index = in.nextInt();
                    int value = in.nextInt();
                    source.add(index, value);
                    break;
                case "Delete":
                    source.remove(in.nextInt());
                    break;
            }
        }
        
        for (Integer i : source) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
7)
import java.util.*;
class Solution{
	
	public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
        String input=sc.next();
        //Complete the code
        Stack<Character> stack=new Stack<>();

        for(char c : input.toCharArray()){
            if(!stack.isEmpty()){
                switch(c){
                    case ')':
                        if( stack.peek() == '(' ){
                            stack.pop();

                        }
                        break;
                    case '}':
                        if( stack.peek() == '{' ){
                            stack.pop();

                        }
                        break;
                    case ']':
                        if( stack.peek() == '[' ){
                            stack.pop();

                        }
                        break;
                    default:
                       stack.push(c);



                }

            }else{
                stack.push(c);
            }
        }

        System.out.println(stack.isEmpty());



    }

}

}
8)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
Set<String> nameSet =new HashSet<String>();
for(int i=0;i<t;i++)
{
    nameSet.add(pair_left[i]+" "+pair_right[i]);
    System.out.println(nameSet.size());
}

    }
}
9)
import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    public int compare(Player p1, Player p2){
        if(p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }
        return p2.score - p1.score;
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}


10)java Generics


import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   boolean wasRun;
   
    public void printArray(Object o) {
       if(wasRun) {
           return;
       }
        System.out.print("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
   }
 
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}


11)java Sort
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class studentCompraretor implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        if(s1.getCgpa() == s2.getCgpa()){
            if (s1.getFname().equals(s2.getFname())) {
                return s1.getId() - s2.getId();
            }else {
                return s1.getFname().compareTo(s2.getFname());
            }
        }else {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
    }
}
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
        Collections.sort(studentList, new studentCompraretor());
      
          for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}




12)java Dequeue
import java.util.*;
 public class Solution {

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Deque deque = new ArrayDeque<>();
    int max=Integer.MIN_VALUE;
    HashSet<Integer> set=new HashSet<>();
    int n=in.nextInt();
    int k=in.nextInt();

    for(int i=0 ;i<n;i++)
    {
        int num=in.nextInt();
        if(deque.size()<k)
       { deque.add(num);
       set.add(num);
       max=set.size();
       }

       else{
           if(set.size()>max)
           max=set.size();


           Object x=deque.poll();
           if(!deque.contains(x))
           set.remove(x);
           deque.add(num);
           set.add(num);

       }

    }
    System.out.print(max);
}
}
13)java BitSet

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void bitSetOperate(String query, String n1, String n2, BitSet b1, BitSet b2){

        switch(query){
            case "AND":
                if(n1.compareTo(n2) > 0){
                    b2.and(b1);
                }else{
                    b1.and(b2);
                }
                break;
            case "OR":
                if(n1.compareTo(n2) > 0){
                    b2.or(b1);
                }else{
                    b1.or(b2);
                }
                break;
            case "XOR":
                if(n1.compareTo(n2) > 0){
                    b2.xor(b1);
                }else{
                    b1.xor(b2);
                }
                break;
            case "FLIP":
                if(n1.equals("1")){
                    b1.flip(Integer.valueOf(n2));
                }else{
                    b2.flip(Integer.valueOf(n2));
                }
                break;
            case "SET":
                if(n1.equals("1")){
                    b1.set(Integer.valueOf(n2));
                }else{
                    b2.set(Integer.valueOf(n2));
                }
                break;
        }
        System.out.printf("%s %s\n", b1.cardinality(), b2.cardinality());
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet bits1 = new BitSet(n);
        BitSet bits2 = new BitSet(n);
        
        while(m-- > 0){
            String query = sc.next();
            String n1 = sc.next();
            String n2 = sc.next();
            bitSetOperate(query, n1, n2, bits1, bits2);
        }
    
    }
}

14)java Priority Queue
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

 class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    int getID(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
    double getCGPA(){
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events){
        List<Student> students = new ArrayList<Student>();
        for(int i=0; i < events.size(); i++){
            String[] event = events.get(i).split(" ");
            if(event[0].equals("ENTER")){
                students.add(new Student(Integer.valueOf(event[3]), event[1], Double.valueOf(event[2])));
            }else {
                Collections.sort(students, new studentComparetor());
                if(students.size() > 0){
                    students.remove(0);
                }
            }
        }
        return students;
    }
}

class studentComparetor implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.getCGPA() == s2.getCGPA()){
            if(s1.getName().compareTo(s2.getName()) == 0){
                return s1.getID() - s2.getID();
            }else {
                return s1.getName().compareTo(s2.getName());
            }  
        }else {
            return Double.compare(s2.getCGPA(), s1.getCGPA());
        }
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}



15)java SubString comparisons


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k)  { String smallest = ""; String largest = "";

    for(int i=0;i<=s.length()-k;i++){
        int range = i + k;
        String subStringI = s.substring(i,range);
        if(subStringI.compareTo(largest)>0){
            largest=subStringI;
        }
        if(subStringI.compareTo(smallest)<0){
            smallest=subStringI;
        }
        if(i==0){
            smallest=subStringI;
        }
    }
    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

16)java String Reverse
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here\. Print output to STDOUT. */
        int b=A.length();
        String u="";
        for(int i=b-1;i>=0;i--)
        {
            u=u+A.charAt(i);
        }
    
       boolean t;
       t=A.equals(u);
       
        
        if(t==true)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}













17)java Anagrams
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = false;
        int count = 0;
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        if(a.length() == b.length()){
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if(ac[i] == bc[j]){
                        bc[j]=' ';
                        count++;
                        break;
                    }
                }
            }
        }
        
        if(count == a.length()){
            anagram = true;
        }
        
        return anagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}








18)java string tokens
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        StringTokenizer str = new StringTokenizer(s, " .,'?!_@");
        System.out.println(str.countTokens());
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
        scan.close();
    }
}




19)pattern syntax checker
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		 Scanner sc = new Scanner (System.in);
        int cases = Integer.parseInt(sc.nextLine());

        while (cases > 0 && sc.hasNextLine()) {
                String patternRegex = sc.nextLine();
        try {
                Pattern r = Pattern.compile(patternRegex);
                System.out.println("Valid");
        }
        catch (PatternSyntaxException e) {
                System.out.println("Invalid");
        }
    }
    sc.close();
}
}

20)java regex
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
 class MyRegex {

String numbb = "(([01]?\\d{1,2})|(2[0-4]\\d)|(25[0-5]))";
String pattern = String.format("%s.%s.%s.%s", numbb, numbb, numbb, numbb);
}

21)java regex2-duplication words

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

           String regex = "\\b(\\w+)(\\s+\\1\\b)+";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
        String input = in.nextLine();

        Matcher m = p.matcher(input);

    
        while (m.find()) {
            input = input.replaceAll("(?i)"+m.group(), m.group(1));
        }
       
        System.out.println(input);
    }

    in.close();
}
}
22)valid username Regular Expression
import java.util.Scanner;
class UsernameValidator {
    static{
        regularExpression="[a-zA-Z]{1}[\\w]{7,29}";
    }
    public static final String regularExpression;
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}


23)java primality test

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
      BigInteger e = new BigInteger(n);
        boolean probablePrime = e.isProbablePrime(13);
        String p = probablePrime ? "prime": "not prime";
        System.out.println(p);
        bufferedReader.close();
    }
}








24)jAVA current formatter

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
     String us,india,china,france;
   us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
   india = NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);
   china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
   france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}
}



25)java tag content extractor

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		    String regex = "<(.+)>([^<>]+)</(\\1)>";
    Pattern p = Pattern.compile(regex);
		Scanner in = new Scanner(System.in);
		 int testCases = Integer.parseInt(in.nextLine());

    while (testCases-- > 0) {
        String line = in.nextLine();
        Matcher m = p.matcher(line);

        if (m.find()) {
            m.reset();
            while (m.find()) {
                System.out.println(m.group(2));
            }
        } else {
            System.out.println("None");
        }
    }

    in.close();
}
}
