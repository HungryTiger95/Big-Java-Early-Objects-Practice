package special_topic_01;

/**
   A student with a name and a major.
*/
public class Student extends Person
{
   private String major;

   /**
      Constructs a Student object.
      @param aName the name of the student
      @param aMajor the major of the student
   */
   public Student(String aName, String aMajor)
   {
      super(aName);
      major = aMajor;
   }
   
   public String toString() 
   {
      return super.toString() + "[major=" + major + "]";
   }
}
