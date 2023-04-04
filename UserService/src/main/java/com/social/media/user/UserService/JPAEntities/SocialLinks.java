package com.social.media.user.UserService.JPAEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "social_links")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class SocialLinks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String socialMediaName;
	
	private String socialMediaLink;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User userId;
}
