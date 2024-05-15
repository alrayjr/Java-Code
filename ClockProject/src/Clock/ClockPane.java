
package Clock;

import javafx.scene.layout.Pane;
import java.util.Calendar; // for clock info
import java.util.GregorianCalendar; // like the same shit as above
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;




public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    
    public ClockPane()
    {
        setCurrentTime();
    }
    
    public ClockPane(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
 
    public void setHour(int hour)
    {
        this.hour= hour;
    }
    public void setMinute(int minute)
    {
        this.minute = minute;
    }
    public void setSecond(int second)
    {
        this.second = second;
    }
    
    public void setCurrentTime()
    {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        
        paintClock();
    }
    private void paintClock()
    {
        double clockRadius = Math.min(getWidth(), getHeight()) * .8 * .5; // selects radius based on height or width of pane
        
        double centerX = getWidth()/2;
        double centerY = getHeight()/2;
        
        Circle circle = new Circle(centerX,centerY,clockRadius); // draws clock body
        
        circle.setFill(Color.BISQUE); // colors in clock white
        circle.setStroke(Color.BLUE);//border is black
        
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        //t1.setFill();
        Text t2 = new Text(centerX - clockRadius+3, centerY -3 , "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY +3 , "6");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "3");
        
        //clock hands
        double sLength = clockRadius *0.8;
        
        double secondX = centerX + sLength * Math.sin(second *(2*Math.PI /60));
        double secondY = centerY - sLength * Math.cos(second *(2*Math.PI /60));
        
        Line sLine = new Line(centerX, centerY, secondX, secondY); //draws second line
        sLine.setStroke(Color.RED);
        
        
        double mLength = clockRadius *0.65;
        
        double minuteX = centerX + mLength * Math.sin(minute *(2*Math.PI /60));
        double minuteY = centerY - mLength * Math.cos(minute *(2*Math.PI /60));
        
        Line mLine = new Line(centerX, centerY, minuteX, minuteY); //draws minute line
        mLine.setStroke(Color.BLUE);
        
        
        double hLength = clockRadius *0.5;
        
        double hourX = centerX + hLength * Math.sin(hour *(2*Math.PI /60));
        double hourY = centerY - hLength * Math.cos(hour *(2*Math.PI /60));
        
        Line hLine = new Line(centerX, centerY, hourX, hourY); //draws Hour line
        hLine.setStroke(Color.BLACK);
        
        getChildren().clear();
        
        getChildren().addAll(circle,t1,t2,t3,t4,sLine,mLine,hLine);
    }
    
    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
        paintClock();
    }
    @Override
    public void setHeight(double height)
    {
        super.setHeight(height);
        paintClock();
    }
}
