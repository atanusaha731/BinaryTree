package Binary;
import java.io.*;
import java.util.*;

public class maiin {
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int da)
		{
			data=da;
			left=null;
			right=null;
			
		}
	}

 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,item;
		
		Node q;
		Node p;
		Node root;
		System.out.println("enter the item");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{ 
			item=sc.nextInt();
	      p= new Node(item);
	        
		
		}
		if(i==0)
		{
			root=p;
		}
		else
		{
			q=root;
			while(1)
				
		
			{
			
				if(p.data>q.data)
				{
					if(q.right==null)
					{
						q.right=p;
						break;
					}
					else
					{
						q=q.right;
					}
				}
				else
				{
					if(q.left==null)
					{
						q.left=p;
						break;
					}
					else
					{
						q=q.left;
					}
				}
				
			}
			
		
		}
		

	}

}
