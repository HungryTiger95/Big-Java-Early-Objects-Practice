package section_04;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

/**
   A tree in which each node has an arbitrary number of children.
*/
public class Tree
{
   private Node root;

   class Node
   {
      public Object data;
      public List<Node> children;

      /**
         Computes the size of the subtree whose root is this node.
         @return the number of nodes in the subtree
      */
      public int size()
      {
         int sum = 0;
         for (Node child : children) { sum = sum + child.size(); }
         return 1 + sum;
      }
   }

   /**
      Constructs an empty tree.
   */
   public Tree()
   {
      root = null;
   }

   /**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
   */
   public Tree(Object rootData)
   {
      root = new Node();
      root.data = rootData;
      root.children = new LinkedList<Node>();
   }

   /**
      Adds a subtree as the last child of the root.
   */
   public void addSubtree(Tree subtree)
   {
      root.children.add(subtree.root);
   }

   /**
      Computes the size of this tree.
      @return the number of nodes in the tree
   */
   public int size() 
   { 
      if (root == null) { return 0; }
      else { return root.size(); }
   }

   /**
      A visitor whose visit method is called for each visited node
      during a tree traversal.
   */
   public interface Visitor
   {
      /**
         This method is called for each visited node.
         @param data the data of the node
      */
      void visit(Object data);
   }

   /**
      Traverses this tree in preorder.
      @param v the visitor to be invoked at each node
   */
   public void preorder(Visitor v) { preorder(root, v); }
   
   /**
      Traverses the tree with a given root in preorder.
      @param n the root of the tree
      @param v the visitor to be invoked at each node
   */
   private static void preorder(Node n, Visitor v)
   {
      if (n == null) { return; }
      v.visit(n.data);
      for (Node c : n.children) { preorder(c, v); }
   }

   /**
      Traverses this tree in postorder.
      @param v the visitor to be invoked at each node
   */
   public void postorder(Visitor v) { postorder(root, v); }
   
   /**
      Traverses the tree with a given root in postorder.
      @param n the root of the tree
      @param v the visitor to be invoked at each node
   */
   private static void postorder(Node n, Visitor v)
   {
      if (n == null) { return; }
      v.visit(n.data);
      for (Node c : n.children) { postorder(c, v); }
   }

   /**
      This iterator visits the nodes of a tree in 
      breadth-first order.
   */
   class BreadthFirstIterator implements Iterator
   {
      private Queue<Node> q;

      /**
         Constructs an iterator for a given tree.
         @param root the root of the tree
      */
      public BreadthFirstIterator(Node root)
      {
         q = new LinkedList<Node>();
         if (root != null) { q.add(root); }
      }

      public boolean hasNext() { return q.size() > 0; }

      public Object next() 
      {
         Node n = q.remove();
         for (Node c : n.children) { q.add(c); }
         return n.data;
      }

      public void remove() { throw new UnsupportedOperationException(); }
   }

   public Iterator iterator() 
   {
      return new BreadthFirstIterator(root);
   }
}
