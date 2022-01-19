import java.util.Scanner;

class tree {
    int x;

    tree left=null;

    tree right=null;
}

class menuDriven
{
    public static tree root=null;

    public static void main(String[] args)
    {
        menuDriven md=new menuDriven();
        int choice,y;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Menu:\n1.Insert\n2.In-order-traversal\n3.Delete:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter element to insert :");
                    y=sc.nextInt();
                    md.insert(y);
                    break;
                case 2:md.inorder(md.root);
                    break;
                case 3:
                    //delete
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(choice!=4);

    }

    void insert(int a)
    {
        tree temp=new tree();
        temp.x=a;
        boolean val=true;
        if(root==null)
        {
            root=new tree();
            root=temp;

            return;
        }
        System.out.println(root.x);
        tree current=new tree();
        current=root;
        while(val)
        {
            if(a<current.x)
            { System.out.println(current.x);
                System.out.println("Trav to left");
                current=current.left;
                if(current==null)
                {
                    System.out.println("Node currently null");
                    current=new tree();
                    current=temp;
                    System.out.println("Entered left of a node");
                    System.out.println(current.x);
                    val=false;
                }
            }
            else if(a>current.x)
            {
                System.out.println("Trav to right");
                current=current.right;
                if(current==null)
                {
                    System.out.println("Node currently null");
                    current=new tree();
                    current=temp;
                    System.out.println("Entered right of a node");
                    System.out.println(current.x);
                    val=false;
                }
            }
            else
            {
                System.out.println("Value exists in the tree\n");
                val=false;
            }
        }
    }



    void inorder(tree temp)
    {
        if(temp!=null)
        {
            inorder(temp.left);
            System.out.println("Visited node :"+temp.x);
            inorder(temp.right);
        }

    }



}
