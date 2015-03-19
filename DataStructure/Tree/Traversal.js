// In-order traversal (ascending order of node key values)
function inOrder(node) {
  if (!(node == null)) {
    inOrder(node.left);
    putstr(node.show() + " ");
    inOrder(node.right);
  }
}



// Pre-order traversal (root node 1st, then left to right)
function preOrder(node) {
  //sth
}

// Post-order traversal (child nodes first, left to right)
function postOrder(node) {
  //sth
}