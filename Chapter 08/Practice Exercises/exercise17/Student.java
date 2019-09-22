package exercise17;

public class Student
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a student with no scores and a maximum number of scores.
      @capacity the maximum number of scores for this student
   */
   public Student(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score for this student.
      @param score the score to add
      @return true if the score was added, false if there was no room to add the score
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
      {
         return false;      
      }
   }

   /**
      Computes the sum of the scores of this student.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score of this student.
      @return the minimum score, or 0 if there are no scores.
   */
   public double getMinimum()
   {
      if (scoresSize == 0) { return 0; }
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this student.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
      {
         return 0;
      }
      else if (scoresSize == 1)
      {
         return scores[0];
      }
      else
      {
         return sum() - getMinimum();
      }
   }
   
   public double[] getScores()
   {
	   return scores;
   }
}

