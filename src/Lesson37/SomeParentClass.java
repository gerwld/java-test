package Lesson37;

// abstract указывает на то что класс не может быть инстанцирован напрямую
// так как он абстрактный, и требует реализации в подклассах
public abstract class SomeParentClass {
    public static void main(String[] args) {

    }
    // может содержать реализацию
    public abstract void someAbstractClass();
}
