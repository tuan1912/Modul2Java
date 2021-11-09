package stop_watch;

import java.util.Date;

public class StopWatch {
    //\***ve UML ***\
    // class: StopWatch
    //attributes: startTime : long
    //            endTime: long
    //method: start() : long
    //        end(): long
    //        getElapsedTime(): long
    private long startTime;
    private long endTime;
    public long start(){
        Date date= new Date();
        this.startTime = date.getTime();
        return startTime;
    }
    public long stop(){
        Date date = new Date();
        this.endTime = date.getTime();
        return endTime;
    }
    public long getElapsedTime (){
        return endTime - startTime;
    }

}


//import java.util.Date;
//
//public class StopWatch {
//    long startTime;
//    long endTime;
//
//    public long start(){
//        startTime = new Date().getTime();
//        return startTime;
//    }
//
//    public long stop(){
//        endTime = new Date().getTime();
//        return endTime;
//    }
//
//    public long getElapsedTime() {
//        return endTime - startTime;
//    }
//}
