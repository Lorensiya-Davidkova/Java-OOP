package PointInRectangle;

public class Rectangle {
    Point bottomLeft;
    Point topRight;

    public Rectangle(Point bottomLeft,Point topRight){
        this.setBottomLeft(bottomLeft);
        this.setTopRight(topRight);
    }
    public void setBottomLeft(Point bottomLeft){
        this.bottomLeft=bottomLeft;
    }
    public void setTopRight(Point topRight){
        this.topRight=topRight;
    }
    public boolean contains(Point point){
        boolean flag=true;
        float currentPointX=point.x;
        float currentPointY=point.y;
        if(this.bottomLeft.x<= currentPointX && this.topRight.x>=currentPointX){
        }else{
           flag=false;
        }
        if(currentPointY<=this.topRight.y && currentPointY>=this.bottomLeft.y){
        }else{
            flag=false;
        }
        return flag;
    }
}
