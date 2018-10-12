package project_7;

public class ServiceLog
{
	// Instance Variables
	private String name, service, date;
	private double price;
	
	// Constructor
	/**
	 * Constructs a service log object given the client name, service name, service date, and service price
	 * @param name the client name
	 * @param service the service name
	 * @param date the service date
	 * @param price the service price
	 */
	public ServiceLog(String name, String service, String date, double price)
	{
		this.name = name;
		this.service = service;
		this.date = date;
		this.price = price;
	}
	
	/**
	 * Constructs an empty service log
	 */
	public ServiceLog()
	{
		
	}
	
	// Methods
	/**
	 * Sets the name of the client for this log
	 * @param name client name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Sets the name of the service for this log
	 * @param service service name
	 */
	public void setService(String service)
	{
		this.service = service;
	}
	
	/**
	 * Sets the date for the service for this log
	 * @param date the date of the service
	 */
	public void setDate(String date)
	{
		this.date = date;
	}
	
	/**
	 * Sets the price for the service for this log
	 * @param price the price of the service
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	/**
	 * Gets the name of the client
	 * @return client name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Gets the name of the service
	 * @return service name
	 */
	public String getService()
	{
		return this.service;
	}
	
	/**
	 * Gets the date of the service
	 * @return date
	 */
	public String getDate()
	{
		return this.date;
	}
	
	/**
	 * Gets the price of the service
	 * @return the price
	 */
	public double getPrice()
	{
		return this.price;
	}
}
