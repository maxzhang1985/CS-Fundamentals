// Node class
function Node(data, left, right) {
  this.data = data;
  this.left = left;
  this.right = right;
  this.show = show;
}

// Displaying the data stored in a node
function show() {
  return this.data;
}

// Binary Search Tree class
function BST() {
  this.root = null; // creating an empty node
  this.insert = insert;
  this.inOrder = inOrder;
}

// Insert new node
function insert(data) {
  var n = new Node(data, null, null);
  if (this.root == null) {
    this.root = n;
  } else {

  }
}
