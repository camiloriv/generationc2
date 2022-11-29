package cl.generation.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.generation.models.User;
import cl.generation.models.UserDTO;
import cl.generation.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	 public User findUserByUsername(String username) {
	        return  userRepository.findUserByUsername(username);
	    }

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepository.findUserByUsername(username);
	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
	    }

	    @SuppressWarnings("unused")
		private Collection<? extends GrantedAuthority> getAuthorities(User user) {
	        String rol = user.getRol().toString();
	        return List.of(new SimpleGrantedAuthority("Rol_"+rol));
	    }


	    public User save(UserDTO user) {
	        User newUser = new User();
	        newUser.setUsername(user.getUsername());
	        newUser.setPassword(user.getPassword());
	        return userRepository.save(newUser);
	    }
}
