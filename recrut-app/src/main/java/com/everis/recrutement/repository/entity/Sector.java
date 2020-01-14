package com.everis.recrutement.repository.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Souhaila
 */
@Entity(name="Sector")
@Table(name="sector")
 public class Sector implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SECTOR", nullable = false)
    private Integer idSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SECTOR_NAME", nullable = false, length = 50)
    private String sectorName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sector")
    private List<Company> company;
    

    public Sector() {
    }

	public Sector(Integer idSector) {
        this.idSector = idSector;
    }

    public Sector(Integer idSector, String sectorName) {
        this.idSector = idSector;
        this.sectorName = sectorName;
    }

    public Integer getIdSector() {
        return idSector;
    }

    public void setIdSector(Integer idSector) {
        this.idSector = idSector;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

}
