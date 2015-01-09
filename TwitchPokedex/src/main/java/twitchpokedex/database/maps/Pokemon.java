package twitchpokedex.database.maps;

// Generated 08/01/2015 2:48:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

/**
 * Pokemon generated by hbm2java
 */
public class Pokemon implements java.io.Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@Column(nullable=false, columnDefinition = "BOOLEAN")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean legendary;

	public Pokemon()
	{
	}

	public Pokemon(int id, String name, boolean legendary)
	{
		this.id = id;
		this.name = name;
		this.legendary = legendary;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLegendary(boolean legendary)
	{
		this.legendary = legendary;
	}
	
	public boolean getLegendary()
	{
		return this.legendary;
	}
}
