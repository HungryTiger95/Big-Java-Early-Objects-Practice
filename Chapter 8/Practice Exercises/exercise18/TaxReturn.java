package exercise18;

/**
   A tax return of a taxpayer in 2008.
*/
public class TaxReturn
{  
	// Instance Variables
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.25;
    private static final double RATE1_SINGLE_LIMIT = 32000;
    private static final double RATE1_MARRIED_LIMIT = 64000;

    private double income;
    private int status;
    
    // Constructors
    /**
      Constructs a TaxReturn object for a given income and 
      marital status.
      @param anIncome the taxpayer income
      @param aStatus either SINGLE or MARRIED
    */   
    public TaxReturn(double anIncome, int aStatus)
    {  
      income = anIncome;
      status = aStatus;
    }

    public double getTax()
    {  
      double tax1 = 0;
      double tax2 = 0;

      if (status == SINGLE)
      {  
         if (income <= RATE1_SINGLE_LIMIT)
         {
            tax1 = RATE1 * income;
         }
         else
         {
            tax1 = RATE1 * RATE1_SINGLE_LIMIT;
            tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
         }
      }
      else
      {  
         if (income <= RATE1_MARRIED_LIMIT)
         {
            tax1 = RATE1 * income;
         }
         else 
         {
            tax1 = RATE1 * RATE1_MARRIED_LIMIT;
            tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
         }
      }

      return tax1 + tax2;
    }
}
