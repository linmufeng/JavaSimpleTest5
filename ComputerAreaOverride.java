public class ComputerAreaOverride 
{
    public static void main(String[] args) 
    {
        CircleOverride circle = new CircleOverride();
        circle.setRadius(108.5);
        Tixing tixing = new Tixing(2.3, 5.9, 3.3);
        Student lmf = new Student();
        Student hjl = new Student();

        System.out.println("林沐风计算圆形面积：" + lmf.computerArea(circle));
        System.out.println("何小龙计算圆形面积：" + hjl.computerArea(tixing));
    }
}
