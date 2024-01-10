package carinventory.itc.cargarageinventory.config;

import org.apache.catalina.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import carinventory.itc.cargarageinventory.entity.UserEn;
import carinventory.itc.cargarageinventory.repository.UserRepository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailservice implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserbyUsername(String username) throws UsernameNotFoundException {
        UserEn user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
        return new User(user.getUsername(), user.getPassword(), mapRolesAuthorities(user.getRole()));
    }

    private Collection<GrantedAuthority> mapRolesAuthorities(String string) {
        return string.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

    }

}
