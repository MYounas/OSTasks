/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

/**
 *
 * @author MY
 */
public class Process {

    int ex,ar,id,wt_time,t_time;float ut_time;
    
    public Process(int id,int e,int a) {
        this.id=id;
        FIFO.last_finish+=e;
        t_time=FIFO.last_finish-a;
        ex=e;
        ar=a;
        wt_time=t_time-ex;
        ut_time=((float)ex/(float)t_time)*100;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder((char)27+"[3"+id+1+"m");
        sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        sb.append("Process"+id+"\n");
        sb.append("T.T->"+t_time+"\n");
        sb.append("Wait Time->"+wt_time+"\n");
        sb.append("Ut Time->"+ut_time+"%\n");
        return sb.toString();
    }
    
}
