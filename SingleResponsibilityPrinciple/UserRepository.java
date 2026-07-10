public class UserRepository {

    public void save(User user) {
        System.out.println("User saved to database: " + user.getName());
    }

    public User findById(int id) {
        return new User(id, "Anisha", "anisha@example.com");
    }
}

//CRUD Operations