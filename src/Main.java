public class Main {
    public static void main(String[] args) {
        var boxFirst = 78.2;
        var boxSecond = 82.7;
        System.out.println(boxFirst + boxSecond);
        System.out.println(boxSecond - boxFirst);
        var result = boxSecond % boxFirst;
        System.out.println(result);
        var hours = 640;
        var work = 8;
        var workers = hours / work;
        System.out.println("Всего работников в компании – " + workers + " человек");
        workers += 94;
        hours = workers * work;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");


    }
}