public class ComputerAreaOverride 
{
    public static void main(String[] args) 
    {
        CircleOverride circle = new CircleOverride();
        circle.setRadius(108.5);
        Tixing tixing = new Tixing(2.3, 5.9, 3.3);
        Student lmf = new Student();
        Student hjl = new Student();

        System.out.println("��������Բ�������" + lmf.computerArea(circle));
        System.out.println("��С������Բ�������" + hjl.computerArea(tixing));
    }
}
