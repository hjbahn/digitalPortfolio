// This is a BST Tree implementing a recursive algorithm for
// search, insertion, deletion, printing, and determining maximum
// depth.
package binarysearchtree;

public class BinSrchTree{
  private BSTNode root; // The root of the Binary Search Tree.

  //PRE: None
  //POS: tree == null
  //TAS: Initialize the Binary Search tree to null
  public BinSrchTree(){
    root = null;
  }

  //PRE: None
  //POS: None
  //TAS: return root being equal to null
  boolean isEmpty(){
    return root == null;
  }

  //PRE: init<key>
  //POS: none
  //TAS: Search the tree for object with key
  // if (object with this key is in the tree)
  // return a reference to the object
  // else
  // return a null reference
  public Object search(String key){
    BSTNode node = recSearch(root, key);
    if(node == null){
      return null;
    }else{
      return node.getElement();
    }
  }

  //PRE:
  //POS:
  //TAS: Currently, this method is stubbed; it is returning
  // null because it has to return something.
  private BSTNode recSearch(BSTNode node, String key){
    return null;
  } // recSearch method

  //PRE: init <key>, init<element>
  //POS: exit <tree> <-- entry <tree> + element
  //TAS: insert the object with key into the tree
  public void insert(String key, Object element){
    root = recInsert(root, key, element);
  }

  //PRE:
  //POS:
  //TAS:
  private BSTNode recInsert(BSTNode node, String key,Object element){
    if(node == null){
      node = new BSTNode(key, element, null, null);
    } else if(key.compareTo(node.getKey()) == 0){
      node.setElement(element);
    } else if(key.compareTo(node.getKey()) < 0){
      node.setLeft(recInsert(node.getLeft(), key, element));
    } else {
      node.setRight(recInsert(node.getRight(), key, element));
    }
    return node;
  }

  //PRE:
  //POS:
  //TAS:
  public void delete(String key){
    root = recDelete(root, key);
  }

  //PRE:
  //POS:
  //TAS: Currently, this method is stubbed; it is returning
  // null because it has to return something.
  private BSTNode recDelete(BSTNode node, String key){
    return null;
  }

  //PRE:
  //POS:
  //TAS:
  private BSTNode remove(BSTNode node){
    return null;
  }

  //PRE:
  //POS:
  //TAS:
  public void printTree (){
    System.out.println(this.toString());
  }

  public String toString(){
    return recToString(root);
  }

  //PRE:
  //POS:
  //TAS:
  private String recToString(BSTNode node){
    if (node == null){
      return "";
    } else {
      return recToString(
          node.getLeft()) + node.getKey() + recToString(node.getRight());
    }
  }

  //PRE:
  //POS:
  //TAS:
  public int depth(){
    return recDepth(root);
  }

  //PRE:
  //POS:
  //TAS:
  protected int recDepth(BSTNode node){
    if (node == null){
      return 0;
    } else {
      return 1 + Math.max( recDepth(node.getLeft()), recDepth(node.getRight()));
    }
  }
}