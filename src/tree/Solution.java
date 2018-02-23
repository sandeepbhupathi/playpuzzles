package tree;

import java.util.*;

public class Solution {

    public static Tree solve() {
        Scanner sc = new Scanner((System.in));
        int noOfTestCases = Integer.parseInt(sc.nextLine());
        String nodeVal[] = sc.nextLine().split("\\s");
        String nodeColor[] = sc.nextLine().split("\\s");
        if(nodeVal.length==noOfTestCases&&nodeColor.length==noOfTestCases){
            noOfTestCases=1;
            Map<Integer,List<Integer>> treeNodeMap = new HashMap<>();
            Map<Integer,Integer> nodeColorMap = new HashMap<>();
            while (noOfTestCases>nodeVal.length){
                String[] nodeAndParent = sc.nextLine().split("\\s");
                if(treeNodeMap.containsKey(Integer.parseInt(nodeAndParent[0]))){
                    treeNodeMap.get(Integer.parseInt(nodeAndParent[0])).add(Integer.parseInt(nodeAndParent[1]));
                }else{
                    List<Integer> valList = new ArrayList<>();
                    valList.add(Integer.parseInt(nodeAndParent[1]));
                    treeNodeMap.put(Integer.parseInt(nodeAndParent[0]),valList);
                }
                nodeColorMap.put(Integer.parseInt(nodeVal[noOfTestCases]),Integer.parseInt(nodeColor[noOfTestCases]));
                noOfTestCases++;
            }
            TreeNode node = new TreeNode(Integer.parseInt(nodeVal[0]), Integer.parseInt(nodeColor[0]) == 1 ? Color.GREEN : Color.RED, 0);

            //still working on it
          /*  treeNodeMap.entrySet().stream().forEach((mapNode)->{
                mapNode.getValue().stream().forEach((eachNode)->{
                    if(treeNodeMap.containsKey(mapNode.getValue())){
                        node.addChild(new TreeNode(Integer.parseInt(nodeVal[noOfTestCases]),
                                        Integer.parseInt(nodeColor[noOfTestCases]) == 1 ? Color.GREEN : Color.RED, 1));
                    }else{
                        node.addChild(new TreeLeaf(Integer.parseInt(nodeVal[noOfTestCases]),
                                        Integer.parseInt(nodeColor[noOfTestCases]) == 1 ? Color.GREEN : Color.RED, 1));
                    }
                }
                );
            });*/

            return node;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
