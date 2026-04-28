package HomeWork3.Builder;

public class BuilderDemo{

    public static void main(String[] args){
        User user = new User.Builder()
                .setName("Дмитрий")
                .setAge(25)
                .setEmail("test@mail.com")
                .build();

        System.out.println(user);
    }
}
