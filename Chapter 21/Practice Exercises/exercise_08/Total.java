package exercise_08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Total
{
	// Instance Variables
	private long total;
    private Lock theLock;

    // Constructors
    public Total()
    {
        this.total = 0;
        this.theLock = new ReentrantLock();
    }

    // Methods
    public long getTotal()
    {
        theLock.lock();
        try
        {
            return total;
        }
        finally
        {
            theLock.unlock();
        }
    }

    public void setTotal(long total)
    {
        theLock.lock();
        try
        {
            this.total = this.total + total;
        }
        finally
        {
            theLock.unlock();
        }
    }
}
