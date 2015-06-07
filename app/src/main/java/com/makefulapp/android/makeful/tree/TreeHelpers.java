package com.makefulapp.android.makeful.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Created by ashley on 6/3/15.
 */
public class TreeHelpers {
    public static List<Instruction> flattenTree(Node node){
        List<Instruction> nodeList = new LinkedList<Instruction>();
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> set = new HashSet<Node>();
        flattenRec(queue, node);
        set.add(null);

        int count = 0;
        Node current = null;

        while(!queue.isEmpty() && count < queue.size()){
            count+=1;
            current = queue.remove();
            //for every node in my queue
            //check to see if I can add that instruction to my list
            //(so check if dependencies are met
            if(isSatisfied(current, set)){
                if(current instanceof Instruction)
                    nodeList.add((Instruction)current);
                set.add(current);
                count = 0;
            } else {
                queue.add(current);
            }
        }

        return nodeList;
    }


    //set = met dependencies
    //queue = list of things I need to do
    //linked = final order
    private static boolean isSatisfied(Node n, Set<Node> s){
        if(n == null || n instanceof Ingredient) return true;
        return s.contains(n.left) && s.contains(n.right);
    }

    private static void flattenRec(Queue<Node> q, Node n){
        if(n == null)
            return;

        q.add(n);
        flattenRec(q, n.left);
        flattenRec(q, n.right);

    }
}
