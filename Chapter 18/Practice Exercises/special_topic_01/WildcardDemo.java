package special_topic_01;

import java.util.ArrayList;

public class WildcardDemo
{
   public static <E> void addAll(ArrayList<E> lst, ArrayList<? extends E> other)
   // public static <E> void addAll(ArrayList<E> lst, ArrayList<E> other)
   // doesn't work with Student array list
   {
      for (E e : other)
      {
         lst.add(e);
      }
   }

   public static <E extends Comparable<? super E>> E max(ArrayList<E> a)
   // public static <E extends Comparable<E>> E max(ArrayList<E> a) 
   // doesn't work with Student array list
   {
      E largest = a.get(0);
      for (int i = 1; i < a.size(); i++)
      {
         if (a.get(i).compareTo(largest) > 0) 
         {
            largest = a.get(i);
         }
      }
      return largest;
   }

   public static void main(String[] args)
   {
      ArrayList<Student> students = new ArrayList<Student>();
      students.add(new Student("Fred", "CS"));
      students.add(new Student("Ann", "Bio"));
      students.add(new Student("Sue", "CS"));

      ArrayList<Person> people =  new ArrayList<Person>();
      people.add(new Person("Harry"));

      addAll(people, students);
      System.out.println(people);

      System.out.println(max(students));      
   }
}
