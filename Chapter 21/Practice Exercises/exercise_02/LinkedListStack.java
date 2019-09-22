package exercise_02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedListStack<E> implements Stack<E>
{
	private Node<E> first;
	private int currentSize;
	
	private Lock stackLock;
	private Condition sizeCondition;
	
	/**
	 * Constructs an empty stack
	 */
	public LinkedListStack()
	{
		this.first = null;
		this.currentSize = 0;
		this.stackLock = new ReentrantLock();
		this.sizeCondition = stackLock.newCondition();
	}
	
	class Node<T>
	{
		public T data;
		public Node<T> next;
	}
	
	@Override
	public void push(E element)
	{
		stackLock.lock();
		try
		{
			System.out.print("[Pushing...]");
			Node<E> newNode = new Node<>();
			newNode.data = element;
			newNode.next = this.first;
			this.first = newNode;
			this.currentSize++;
			
			System.out.println("[Size: " + this.currentSize + "]");
			this.sizeCondition.signalAll();
		}
		finally
		{
			stackLock.unlock();
		}
		
	}
	
	@Override
	public E pop() throws InterruptedException
	{
		stackLock.lock();
		try
		{
			System.out.print("[Popping...]");
			while(first == null)
			{
				System.out.print("[Waiting...][Size: " + this.currentSize + "]\n");
				sizeCondition.await();
			}

			E element = this.first.data;
			this.first = this.first.next;
			this.currentSize--;
			
			System.out.println("[Size: " + this.currentSize + "]");
			return element;
		}
		finally
		{
			stackLock.unlock();
		}
	}
	
	@Override
	public boolean isEmpty()
	{
		stackLock.lock();
		try
		{
			System.out.println("[Is Empty?: " + this.first == null);
			return this.first == null;
		}
		finally
		{
			stackLock.unlock();
		}
	}
	
	public int size()
	{
		return this.currentSize;
	}
}
