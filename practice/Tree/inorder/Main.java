class Main{
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(6);
        tree.add(8);
        tree.add(1);
        System.out.println("Inorder: ");
        tree.inOrder();
    }
}