public class Student 
{
    double computerArea(CircleOverride c){          //是重载方法
        double area = c.getArea();
        return area;
    }

    double computerArea(Tixing t){                  //是重载方法
        double area = t.getArea();
        return area;
    }
}
