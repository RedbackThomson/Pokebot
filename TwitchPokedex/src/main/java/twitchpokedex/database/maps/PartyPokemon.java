package twitchpokedex.database.maps;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Generated 10/01/2015 12:15:57 AM by Hibernate Tools 3.4.0.CR1

/**
 * Party generated by hbm2java
 */
public class PartyPokemon implements java.io.Serializable, Comparable<PartyPokemon>
{
	private Integer id;
	private int user;
	private int slot;
	private int pokemon;
	private int level;
	private String name;

	public PartyPokemon()
	{
	}

	public PartyPokemon(int user, int slot, int pokemon, int level, String name)
	{
		this.user = user;
		this.slot = slot;
		this.pokemon = pokemon;
		this.level = level;
		this.name = name;
	}

	@Id
	@Column(name = "id")
	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public int getUser()
	{
		return this.user;
	}

	public void setUser(int user)
	{
		this.user = user;
	}

	public int getSlot()
	{
		return this.slot;
	}

	public void setSlot(int slot)
	{
		this.slot = slot;
	}

	public int getPokemon()
	{
		return this.pokemon;
	}

	public void setPokemon(int pokemon)
	{
		this.pokemon = pokemon;
	}

	public int getLevel()
	{
		return this.level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int compareTo(PartyPokemon o)
	{
		return this.getSlot() - o.getSlot();
	}

}
