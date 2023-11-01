import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class FindModeinBinarySearchTree {
    int max=0;
    int count=0;
    int temp=-1;
    public int[] findMode(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        sol(root,list);
        int res[]=new int[list.size()];
        int i=0;
        for(Integer num : list)
        {
            res[i++]=num;
        }
        return res;
    }
    public void sol(TreeNode root,List<Integer> list)
    { if(root==null)
        {
            return;
        }
        sol(root.left,list);
        if(count==0 || root.val==temp)
        {
            temp=root.val;
            count++;
            if(count>max)
            {
                max=count;
                list.clear();
                list.add(root.val);
            }
            else if(count==max)
            { list.add(root.val);
            }
        }
        else
        {
            count=1;
            temp=root.val;
            if(count==max)
            {
                list.add(root.val);
            }
        }
        sol(root.right,list);
    }
}
