import java.util.*;
public class MultiArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //INITIALIZATION
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.print(list);



    }


}
