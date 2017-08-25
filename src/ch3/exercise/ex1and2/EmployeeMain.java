package ch3.exercise.ex1and2;

public class EmployeeMain {

    public static void main(String[] args) {

        Measurable e1 = new Employee("ZLATAN",2000000);   // 직원 1
        Measurable e2 = new Employee("GD", 6000000);      // 직원 2
        Measurable e3 = new Employee("INSUK",10000000);   // 직원 3

        Measurable[] measurables = {};

        System.out.println(" 평균 급여 : "+ average(measurables) + "원");
        System.out.println(" 급여가 가장 높은 사람 : "+  ((Employee) largest(measurables)).getName());

    }
    /*
     * 평균 급여 계산 함수
     */
    public static double average(Measurable[] objects){
        double sum = 0.0;
        if (objects.length == 0) return sum;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
    /*
     *  가장 높은 급여의 직원 구하는 함수
     */
    public static Measurable largest(Measurable[] objects){
        if (objects.length == 0) return new Employee();
        Measurable largestObj = objects[0];
        for (Measurable obj : objects) {
            if(obj.getMeasure() >= largestObj.getMeasure()) largestObj = obj ;
        }
        return largestObj;
    }
}
