package section_05;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		PriorityQueue<WorkOrder> q = new PriorityQueue<WorkOrder>();
		q.add(new WorkOrder(3, "Shampoo Carpets"));
		q.add(new WorkOrder(7, "Empty Trash Can"));
		q.add(new WorkOrder(8, "Water Plants"));
		q.add(new WorkOrder(10, "Remove Pencil Sharpener Shavings"));
		q.add(new WorkOrder(6, "Replace Light Bulb"));
		q.add(new WorkOrder(1, "Fix Broken Sink"));
		q.add(new WorkOrder(9, "Clean Coffee Maker"));
		q.add(new WorkOrder(2, "Order Cleaning Supplies"));
		
		while(q.size() > 0)
		{
			System.out.println(q.remove());
		}
	}
}
