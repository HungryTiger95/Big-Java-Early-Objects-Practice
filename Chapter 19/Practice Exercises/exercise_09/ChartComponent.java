package exercise_09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class ChartComponent extends JComponent
{
	// Instance Variables
	private ArrayList<Bar> graph;
	
	// Constructors
	public ChartComponent()
	{
		this.graph = new ArrayList<Bar>();
	}
	
	// Methods
	public void addBar(int length, String label, Color color)
	{
		Bar bar;
		
		if(graph.size() == 0)
		{
			// Add the first bar
			bar = new Bar(30, 30, label, length, color);
		}
		else
		{
			bar = new Bar(30, graph.get(graph.size() - 1).getYTop() + Bar.HEIGHT + 5, label, length, color);
		}
		
		this.graph.add(bar);
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		for(Bar b : graph)
		{
			b.draw(g2);
		}
	}
}
