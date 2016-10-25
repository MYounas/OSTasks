/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

import java.util.Scanner;

/**
 *
 * @author MY
 */
public class FIFO {
    
    public static int last_finish=0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);int n,i,j,k,e,a;
        System.out.print("Enter no of Processes:");
        n=in.nextInt();
        Process p[]=new Process[n];
        for(i=0;i<n;i++){
            System.out.print("Execution Time of Process"+(i+1)+" :");
            e=in.nextInt();
            System.out.print("Arrival Time of Process"+(i+1)+" :");
            a=in.nextInt();
            p[i]=new Process(i+1,e,a);
        }
        System.out.println("-------------------------------------------");
        System.out.println("T.T  |  wait Time  |  Utilization Time");
        System.out.println("-------------------------------------------");
        for(i=0;i<n;i++){
//            System.out.println(p[i]);
            System.out.println("P"+p[i].id+"  |  "+p[i].t_time+"  |  "+p[i].wt_time+"  |  "+p[i].ut_time+"%");
        }
            
    }
    
}
