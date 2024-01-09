// package carinventory.itc.cargarageinventory.config;

// import carinventory.itc.cargarageinventory.entity.User;
// import carinventory.itc.cargarageinventory.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Component;

// @Component
// public class DataLoader implements CommandLineRunner {

// private final UserRepository userRepository;
// private final BCryptPasswordEncoder passwordEncoder;

// @Autowired
// public DataLoader(UserRepository userRepository, BCryptPasswordEncoder
// passwordEncoder) {
// this.userRepository = userRepository;
// this.passwordEncoder = passwordEncoder;
// }

// @Override
// public void run(String... args) throws Exception {
// // Check if the admin user already exists
// if (!userRepository.existsByUsername("admin")) {
// // Create a new admin user
// User adminUser = new User();
// adminUser.setUsername("admin");
// adminUser.setPassword(passwordEncoder.encode("123")); // Encrypt the password
// adminUser.setRole("ADMIN");

// // Save the admin user to the database
// userRepository.save(adminUser);

// System.out.println("Admin user registered successfully.");
// } else {
// System.out.println("Admin user already exists.");
// }
// }
// }
