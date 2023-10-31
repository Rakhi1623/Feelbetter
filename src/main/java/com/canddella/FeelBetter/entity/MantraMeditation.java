package com.canddella.FeelBetter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mantrameditation")
public class MantraMeditation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long m_id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Meditation meditation;

    @Column(name = "heading")
    private String heading;

    @Column(name = "steps")
    private String steps;

    @Column(name = "links")
    private String links;

	public Long getM_id() {
		return m_id;
	}

	public void setM_id(Long m_id) {
		this.m_id = m_id;
	}

	public Meditation getMeditation() {
		return meditation;
	}

	public void setMeditation(Meditation meditation) {
		this.meditation = meditation;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

}
