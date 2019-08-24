package worked_example_01;

public interface Visitor<E>
{
	/**
	 * This method is called for each visited node.
	 * @param data the data of the node
	 */
	void visit(E data);
}
