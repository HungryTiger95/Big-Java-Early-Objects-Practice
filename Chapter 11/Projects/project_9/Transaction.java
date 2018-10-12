package project_9;

public class Transaction
{
	// Instance Variables
	private int invoiceNumber;
	private double transactionAmount;
	private String transactionType;
	
	// Constructors
	public Transaction(int invoiceNumber, double transactionAmount, String transactionType)
	{
		this.invoiceNumber = invoiceNumber;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}
	
	public Transaction()
	{
		
	}
	
	// Methods
	/**
	 * Sets the invoice number for this transaction
	 * @param invoiceNumber invoice number
	 */
	public void setInvoiceNumber(int invoiceNumber)
	{
		this.invoiceNumber = invoiceNumber;
	}
	
	/**
	 * Gets the invoice number for this transaction
	 * @return the invoice number
	 */
	public int getInvoiceNumber()
	{
		return this.invoiceNumber;
	}
	
	/**
	 * Sets the transaction amount for this transaction
	 * @param amount the transaction amount
	 */
	public void setTransactionAmount(double amount)
	{
		if(amount <= 0)
		{
			throw new IllegalArgumentException("Amount Cannot Be Less than or Equal to 0");
		}
		this.transactionAmount = amount;
	}
	
	/**
	 * Gets the transaction amount for this transaction
	 * @return the transaction amount
	 */
	public double getTransactionAmount()
	{
		return this.transactionAmount;
	}
	
	/**
	 * Sets the transaction type for this transaction
	 * @param transactionType the transaction type
	 */
	public void setTransactionType(String transactionType)
	{
		this.transactionType = transactionType;
	}
	
	/**
	 * Gets the transaction type for this transaction
	 * @return the transaction type
	 */
	public String getTransactionType()
	{
		return this.transactionType;
	}
}
