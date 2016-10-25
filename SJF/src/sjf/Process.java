/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjf;

/**
 *
 * @author MY
 */
public class Process {

    int id,ex,ar,t_time,wt_time;float ut_time;
    
    public Process(int id,int e,int a) {
        this.id=id;
        ex=e;
        ar=a;
    }
    
    void runProcess(){
        SJF.last_finish+=ex;
        t_time=SJF.last_finish-ar;
        wt_time=t_time-ex;
        ut_time=((float)ex/(float)t_time)*100;
    }
    
}
