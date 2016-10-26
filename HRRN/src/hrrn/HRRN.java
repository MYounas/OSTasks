package hrrn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HRRN {

    public static int last_finish = 0, flag = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int n, i, j, k, e, a;
        System.out.print("Enter no of Processes:");
        n = in.nextInt();
        Process p[] = new Process[n];
        ArrayList<Process> proc=new ArrayList<>();
        for (i = 0; i < n; i++) {
            System.out.print("Execution Time of Process" + (i + 1) + " :");
            e = in.nextInt();
            System.out.print("Arrival Time of Process" + (i + 1) + " :");
            a = in.nextInt();
            p[i] = new Process(i + 1, e, a);
            proc.add(p[i]);
        }
        ArrayList<Process> list = new ArrayList();Process tempRun;
        p[0].runProcess();
        
        for (i = 0; i < (n - 1); i++) {
            if (flag == 0) {
                for (j = 1; j < proc.size(); j++) {
                    if (!list.contains(proc.get(j)) && proc.get(j).ar <= last_finish) {
                        list.add(proc.get(j));
                    }
                }
                
                
                
                Collections.sort((List)list,new Comparator<Process>() {
                    @Override
                    public int compare(Process o1, Process o2) {
                        return (int)(o2.res_ratio - o1.res_ratio);
                    }
                });
                
                tempRun = list.get(0);
                tempRun.runProcess();
                proc.remove(tempRun);
                list.remove(tempRun);
            }
            flag = (list.size() == (n - 2)) ? 1 : 0;
            int tempSize=list.size();
            if(flag==1){
                do{
                    tempRun=list.get(0);
                    tempRun.runProcess();
                    proc.remove(tempRun);
                    list.remove(tempRun);
                    tempSize--;
                }while(tempSize>0);
                break;
            }
            
        }

        System.out.println("-------------------------------------------");
        System.out.println("Proc  |  T.T  |  wait Time  |  Utilization Time");
        System.out.println("-------------------------------------------");
        for (i = 0; i < n; i++) {
            System.out.println("P" + p[i].id + "  |  " + p[i].t_time + "  |  " + p[i].wt_time + "  |  " + p[i].ut_time + "%");
        }

    }

    
}
