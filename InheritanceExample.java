class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}
    class Cat extends Animal{
        void meow(){
            System.out.println("Cat says meow.");

        }
    }
    public class InheritanceExample {
        public static void main(String[]args){
            Dog dog=new Dog();
            dog.eat();
            dog.bark();
            Cat cat=new Cat();
            cat.meow();

        }
    }

