package com.canddella.FeelBetter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="exercises")
public class Exercises {
	
	    @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    @Column(name="id")
	    private Long id;

	    @Column(name="exercises_type")
	    private String exercisesType;

	    @Column(name="description")
	    private String description;

	    @Column(name="image_link")
	    private String imageLink;

	    @Column(name="pagelink")
	    private String pageLink;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExercisesType() {
			return exercisesType;
		}

		public void setExercisesType(String exercisesType) {
			this.exercisesType = exercisesType;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageLink() {
			return imageLink;
		}

		public void setImageLink(String imageLink) {
			this.imageLink = imageLink;
		}

		public String getPageLink() {
			return pageLink;
		}

		public void setPageLink(String pageLink) {
			this.pageLink = pageLink;
		}


}
