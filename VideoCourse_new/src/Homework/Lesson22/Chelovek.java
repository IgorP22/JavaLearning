package Homework.Lesson22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }

    private StringBuilder surname;
    public StringBuilder getSurname() {
        // если в методе гет возвращается изменяемый тип данных, то лучше возвращать его копию
        StringBuilder sb = new StringBuilder(surname);
        return sb;
    }
    public void setSurname(StringBuilder s) {
        surname = s;
    }

    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }

    private boolean clever;
    public boolean isClever(){
        return clever;
    }
    public void setClever(boolean b) {
        clever = b;
    }


}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        //  c.name = "Petya";
        // c.age = 50;
        // c.ves = 50;
        c.setName("Petya");
        c.setSurname(new StringBuilder("Ivanov"));
        c.setVes(50);
        c.setAge(15);

        System.out.println(c.getName());
        System.out.println(c.getSurname());
        System.out.println(c.getAge());
        System.out.println(c.getVes());

        c.getSurname().append("!!!");
        // при написании геттера как и в фамилии можно с помощью метода get изменить объект
        // для того чтобы избежать этого геттер должен работать с копией объекта
        System.out.println(c.getSurname());



    }
}
