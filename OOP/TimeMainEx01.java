class Time{
    // public int hour;
    // public int minute;
    // public int second;
    private int hour;
    private int minute;
    private int second;
    // 생성자(맴버필드 초기화)
    public Time(int hour, int minute, int second){
        // this.hour = hour;
        // this.minute = minute;
        // this.second = second;
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    // setter
    // setter와 getter는 형식대로 안적어도 에러는 안나지만 보통 이렇게 씀
    public void setHour(int hour){
        if(hour<0||hour>=24){
            hour = 0;
        }
        else this.hour = hour;
    }
    public void setMinute(int minute){
        if(minute<0||minute>=60){
            minute = 0;
        }
        else this.minute = minute;
    }
    public void setSecond(int second){
        if(second<0||second>=60){
            second = 0;
        }
        this.second = second;
    }
    // getter
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;      
    }
}

public class TimeMainEx01{
    public static void main(String[] args){
        // Time t = new Time();
        Time t = new Time(10, 10, 10);
        // 잘못된 데이터
    //     // private으로 막자!
    //     t.hour = 25;
    //     t.minute = 70;
    //     t.second = 100;
    //     System.out.print(t.hour + "시 ");
    //     System.out.print(t.minute + "분 ");
    //     System.out.print(t.second +  "초 ");
        t.setHour(12);
        t.setMinute(40);
        t.setSecond(30);
        System.out.print(t.getHour() + "시 ");
        System.out.print(t.getMinute() + "분 ");
        System.out.print(t.getSecond() + "초 ");
    }
}