// In-order traversal (ascending order of node key values)
var inOrderList = [];

function inOrder(node) {
  if (!(node == null)) {
    inOrder(node.left);
    inOrderList.push(node.show());
    inOrder(node.right);
  }
  return inOrderList;
}

// Pre-order traversal (root node 1st, then left to right)
var preOrderList = [];

function preOrder(node) {
  if (!(node == null)) {
    preOrderList.push(node.show());
    preOrder(node.left);
    preOrder(node.right);
  }
  return preOrderList;
}

// Post-order traversal (child nodes first, left to right)

var postOrderList = [];

function postOrder(node) {
  if (!(node == null)) {
    postOrder(node.left);
    postOrder(node.right);
    postOrderList.push(node.show());
  }
  return postOrderList;
}

// Test Case for traversal
var nums = new BST();
nums.insert(23);
nums.insert(45);
nums.insert(16);
nums.insert(37);
nums.insert(3);
nums.insert(99);
nums.insert(22);
inOrder(nums.root);
preOrder(nums.root);