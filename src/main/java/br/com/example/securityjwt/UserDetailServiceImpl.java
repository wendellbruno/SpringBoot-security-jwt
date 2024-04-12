package br.com.example.securityjwt;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {

    private final UserReposity userRepository;

    public UserDetailServiceImpl(UserReposity user) {
        this.userRepository = user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
        .map(UserAuthenticated::new)
        .orElseThrow(() -> new UsernameNotFoundException("Usuario não localizado"));
    }
    
}
