public class UserRepository {

    public void save(User user) {
        System.out.println("User saved to database: " + user.getName());
    }

    public User findById(int id) {
        return new User(id, "Anisha", "anisha@example.com");
    }
}

//CRUD Operations
//Handles all database operations related to users, such as saving or retrieving user information.
//It separates data access logic from business logic