package bai4;

public class OopExample {

    /*
    Tạo abstract class Animal có phương thức sayHello.
     abstract class này thể hiện tính trừu tượng,
     có nghĩa ta định ra rằng dù là con vật gì đi nữa thì nó cũng có phương thức sayHello.
     */

    public abstract class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }
        public abstract void sayHello();

        public String getName() {
            return name;
        }
    }

    /*
    Cat kế thừa Animal
    Chúng overide lại phương thức sayHello thể hiện tính đóng gói
     */
    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
        @Override
        public void sayHello() {
            System.out.println("Day la " + super.getName());
        }
    }







}
