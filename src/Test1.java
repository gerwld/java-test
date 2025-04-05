import Package1.Person;

public class Test1 { // public либо default / не может быть private - нет смысла
    public int id; // доступ к полю везде
    private int d2; // доступ только в пределах класса
    int d3; // default() модификатор доступа, доступно в пределах package
    protected int d4; // доступны в пределах одного пакета, но доступны даже подклассам. свободнее за default()

    public static void main(String[] args) {
        // public private default protected

        Person person1 = new Person();
        person1.name = "bob";

//        System.out.println(person1.surname); // private не выведет
        System.out.println(person1.CONSTANT); // можно вывести
    }

    private void technicalMethod() { // приватный, в пределах класса Test1

    }
}