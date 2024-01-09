// package carinventory.itc.cargarageinventory.config;

// import
// org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import
// org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;

// import static org.springframework.security.config.Customizer.withDefaults;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

// private final UserDetailsService userDetailsService;

// public SecurityConfig(UserDetailsService userDetailsService) {
// this.userDetailsService = userDetailsService;
// }

// @Bean
// public void configureGlobal(AuthenticationManagerBuilder auth) throws
// Exception {
// auth
// .userDetailsService(userDetailsService)
// .passwordEncoder(passwordEncoder());
// }

// @Bean
// public PasswordEncoder passwordEncoder() {
// return new BCryptPasswordEncoder();
// }

// @Bean
// public HttpSecurity httpSecurity() throws Exception {
// return http()
// .authorizeRequests(authorizeRequests -> authorizeRequests
// .antMatchers("/vehicles/list").hasAnyRole("ADMIN", "CUSTOMER")
// .antMatchers("/vehicles/**").hasRole("ADMIN")
// .anyRequest().authenticated())
// .formLogin(withDefaults())
// .logout(logout -> logout.permitAll());
// }
// }
