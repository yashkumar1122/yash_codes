class Tree{
    private Node root;

    public Tree(){
        root = null;
    }

    private void addHelper(int value, Node root){
        if(root.data < value){
            if(root.right == null)
                root.right = new Node(value);
            else
                addHelper(value, root.right);
        }
        else{
            if(root.left == null)
                root.left = new Node(value);
            else
                addHelper(value, root.left);
        }
    }

    public void add(int value){
        if(root == null)
            root = new Node(value);
        else
            addHelper(value, root);
    }

    private void inOrderHelper(Node root){
        if(root != null){
            inOrderHelper(root.left);
            System.out.print(root.data + ", ");
            inOrderHelper(root.right);
        }
    }

    public void inOrder(){
        inOrderHelper(root);
    }
}