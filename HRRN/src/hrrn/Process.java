package hrrn;


public class Process {

    int id,ex,ar,t_time,wt_time;float ut_time,res_ratio;
    
    public Process(int id,int e,int a) {
        this.id=id;
        ex=e;
        ar=a;
//        res_ratio=(HRRN.last_finish+ex)/ex;
    }
    
    void ResRatio(){
        res_ratio=(HRRN.last_finish+ex)/ex;
    }
    
    void runProcess(){
        HRRN.last_finish+=ex;
        t_time=HRRN.last_finish-ar;
        wt_time=t_time-ex;
        ut_time=((float)ex/(float)t_time)*100;
    }
    
}
